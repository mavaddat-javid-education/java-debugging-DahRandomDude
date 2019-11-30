import java.sql.Array;
import java.util.stream.*;

public class DogTriathlonParticipant2 {
    private final int NUM_EVENTS;
    private static int totalCumulativeScore = 0;

    private String name;
    private int obedienceScore;
    private int conformationScore;
    private int agilityScore;
    private int total;
    private double avg;
    private boolean doScoresAgree;

    public DogTriathlonParticipant2(String name, int numEvents, int... scores) {
        this.name = name;
        NUM_EVENTS = numEvents;
        int totalNot0 = 0;
        if(scores.length < numEvents) {
            int[] s = new int[numEvents];
            System.arraycopy(scores, 0, s , 0, numEvents);
            scores = s;
        }
        for(int score : scores){
            if (score != 0)
                totalNot0++;
            if (totalNot0 > (numEvents-1))
                break; 
        }

        total = IntStream.of(scores).sum();
        if (NUM_EVENTS == 0)
            avg = 0;
        else
            avg = (double) total / NUM_EVENTS;
        totalCumulativeScore = totalCumulativeScore + total;

    }

    public void display() {
        System.out.println(name + " participated in " + NUM_EVENTS + " events and has an average score of " + avg);
        System.out.println(" " + name + " has a total score of " + total + " bringing the total cumulative score to "
                + totalCumulativeScore);
    }
}