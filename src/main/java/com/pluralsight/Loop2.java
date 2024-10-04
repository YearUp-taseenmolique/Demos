package com.pluralsight;
import java.util.*;

public class Loop2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        do {


            //Establish KNOWN values, from user.
            String pickupDate = PromptForString("When will you pick this up? ");
            String dropOffDate = PromptForString("When will you drop it off? ");

            System.out.print("How many days will you take the car for? ");
            short numberOfDays = scanner.nextShort();
            scanner.nextLine();

            boolean needsTollTag = PromptForYesNo("Do you need a Toll Tag? ");
            boolean needsGPS = PromptForYesNo("Do you need a GPS? ");
            boolean needsRoadSideAssistance = PromptForYesNo("Do you need Road Side Assistance? ");

            System.out.print("What is your age? ");
            short age = scanner.nextShort();
            scanner.nextLine();


            //Calculate Unknown Values
            float CarRentalFee = 29.99F;
            double basicCarRentalFee = (numberOfDays * CarRentalFee);

            double optionsTotalFee = 0;

            if (needsTollTag) {
                optionsTotalFee += 3.95F * numberOfDays;
            }
            if (needsGPS) {
                optionsTotalFee += 2.95F * numberOfDays;
            }
            if (needsRoadSideAssistance) {
                optionsTotalFee += 3.95F * numberOfDays;
            }


            double underageSurcharge = 0;

            if (age < 25) {
                underageSurcharge = basicCarRentalFee * 0.30;
            }

            double totalCost = 0;

            totalCost = basicCarRentalFee + optionsTotalFee + underageSurcharge;


            //Display the results
            System.out.printf("Basic Car Rental Fee:      %.2f\n", basicCarRentalFee);
            System.out.printf("Options fee:               %.2f\n", optionsTotalFee);
            System.out.printf("Underage Surcharge Fee:    %.2f\n", underageSurcharge);
            System.out.println("--------------------------------------");
            System.out.printf("TOTAL:                     %.2f\n", totalCost);

        } while (PromptForYesNo("Do you want to rent another car (Y for Yes, N for No)? "));

    }

    public static String PromptForString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static boolean PromptForYesNo(String prompt) {
        while (true) {

            System.out.print(prompt + " (Y for yes, N for No)?");
            String userinput = scanner.nextLine();

            return (userinput.equalsIgnoreCase("Y") || userinput.equalsIgnoreCase("Yes"));


        }
    }
}




