import java.util.Scanner;

public class AssignPerson3
 {
    public static void main(String[] args) {
        int donationThing;
        String WorkerDudes;
        String message;
        final int CLOTHING_STUFF = 1;
        final int OTHER_STUFF = 2;
        final String CLOTHING_DUDE = "Regina";
        final String OTHER_DUDE = "Marco";

        Scanner input = new Scanner(System.in);
        System.out.println("What this be?");
        System.out.print("Enter " + CLOTHING_STUFF + " for clothing, " + OTHER_STUFF + " for anything else... ");
        donationThing = input.nextInt();

        if (donationThing == CLOTHING_STUFF) {
            WorkerDudes = CLOTHING_DUDE;
            message = "a clothing donation";
        } if(donationThing == OTHER_STUFF) {
            WorkerDudes = OTHER_DUDE;
            message = "a non-clothing donation";
        }else{
            WorkerDudes = "Nobody because you didn't give us a valid answer you moron";
        }

        System.out.println("You entered " + donationThing);
        System.out.println("The volunteer who will price this item is " + WorkerDudes);

    }
}