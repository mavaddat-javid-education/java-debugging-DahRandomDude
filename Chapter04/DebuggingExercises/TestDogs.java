import java.util.Random;
public class TestDogs {
    public static void main(String[] args) {

        DogTriathlonParticipant2[] dogs = new DogTriathlonParticipant2[3];
        dogs[0] = new DogTriathlonParticipant2("Bowser", 3, (new Random()).nextInt(100) , (new Random()).nextInt(100) , (new Random()).nextInt(100) );
        dogs[0].display();
        Random Random = new Random();
        dogs[1] = new DogTriathlonParticipant2("Rush", 3, (new Random()).nextInt(100) , (new Random()).nextInt(100) , (new Random()).nextInt(100) );
        dogs[1].display();
        dogs[2] = new DogTriathlonParticipant2("Ginger", 3, (new Random()).nextInt(100) , (new Random()).nextInt(100) , (new Random()).nextInt(100) );
        dogs[2].display();
    }
}
