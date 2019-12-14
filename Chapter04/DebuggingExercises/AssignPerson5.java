import java.util.Scanner;

public class AssignPerson5 {
    public static void main(String[] args) {
        int donationThing;
        String WorkerDudes;
        String message;
        final int CLOTHING_STUFF = 1;
        final int ELECTRONIC_STUFF = 2;
        final int FURNITURE_STUFF = 3;
        final int OTHER_STUFF = 4;
        final String CLOTHING_DUDE = "Regina";
        final String OTHER_DUDE = "Marco";
        final String FURNITURE_DUDE = "Walter";
        final String ELECTRONIC_DUDE = "Lydia";

        Scanner input = new Scanner(System.in);
        System.out.println("What this be?");
        System.out.print("Enter " + CLOTHING_STUFF + " for clothing, " + ELECTRONIC_STUFF + " for electronics, "
                + FURNITURE_STUFF + " for furniture and " + OTHER_STUFF + " for anything else. ");
        donationThing = input.nextInt();

        while (donationThing < CLOTHING_STUFF || donationThing > OTHER_STUFF) {
            System.out.println("You entered " + donationThing + " which is not a valid donation type");
            System.out.print("Please enter a value between " + CLOTHING_STUFF + " and " + OTHER_STUFF + "... ");
            System.out.print("Enter an integer... ");
            donationThing = input.nextInt();
        }

        switch (donationThing) {
        case (CLOTHING_STUFF): {
            WorkerDudes = CLOTHING_DUDE;
            message = "a clothing donation";
            break;
        }
        case (FURNITURE_STUFF): {
            WorkerDudes = FURNITURE_DUDE;
            message = "a furniture donation";
            break;
        }
        case (ELECTRONIC_STUFF): {
            WorkerDudes = ELECTRONIC_DUDE;
            message = "electronics donation";
            break;
        }
        case (OTHER_STUFF): {
            WorkerDudes = OTHER_DUDE;
            message = "another donation type";
            break;
        }
        default: { //no longer reachable because while-loop forces valid choice
            WorkerDudes = "Nobody, just choose 1, 2, 3 or 4 you childish moron";
            message = "invalid donation type cause you clearly didn't read / choose to ignore the instructions";
        }
        }

        System.out.println("This is a " + message);
        System.out.println("You entered " + donationThing);
        System.out.println("The volunteer who will price this item is " + WorkerDudes);

    }
}