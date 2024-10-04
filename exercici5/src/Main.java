import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declare scanner
        Scanner input = new Scanner(System.in);

        //Declare variables
        boolean goodCamperInput = false;
        int isCamper = -1;
        final int carPrice = 73490;
        final int priceCamper = 20000;
        final double devalue = 0.00001;
        double totalCarPrice = carPrice;
        double finalPrice = 0.0;
        double numKm = 0.0;

        //Ask if the user has a Camper model
        System.out.println("Is your Volkswagen Grand California a Camper Full Equip version?");
        System.out.println("1. Yes");
        System.out.println("2. No");

        do {
            //Check if the input is a number or not
            if (input.hasNextInt())
            {
                isCamper= input.nextInt();
                //If it's a number, check if it's between 1 and 2
                if (isCamper != 1 && isCamper != 2) {
                    //If it's not, ask again
                    System.out.println("That's not a valid number");
                } else {
                    goodCamperInput = true;
                }
            } else{
                //If it's not a number, ask again
                System.out.println("That's not a number");
            }
            //Clear input
            input.nextLine();
        } while(!goodCamperInput);

        System.out.println("How many Km has your car?");

        do {
            //Check if the input is a number or not
            if (input.hasNextInt())
            {
                numKm= input.nextInt();
                //If it's a number, check if it's between 1 and 10
                if (numKm < 0.0f) {
                    //If it's not, ask again
                    System.out.println("That's not a valid number");
                }
            } else{
                //If it's not a number, ask again
                System.out.println("That's not a number");
            }
            //Clear input
            input.nextLine();
        } while(numKm < 0.0f);

        //If it's a camper model, add the corresponding price
        if (isCamper == 1)
        {
            totalCarPrice = finalPrice + priceCamper;
        }

        //Calculate the devaluation
        finalPrice = totalCarPrice * (1.0 - (devalue / 100.0) * numKm);

        //print out the devaluation
        System.out.println("Your The Volkswagen initial price was " + totalCarPrice);
        System.out.println("Your Volkswagen would resell for " + finalPrice + " euros" );

    }
}