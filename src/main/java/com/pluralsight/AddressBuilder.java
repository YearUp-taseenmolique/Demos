package com.pluralsight;
import java.util.*;

public class AddressBuilder {
    static Scanner s = new Scanner(System.in);
    static StringBuilder bob = new StringBuilder();
    public static void main(String[] args) {

    //Get your full name
        System.out.print("What is your full name? \n");
        String fullName = s.nextLine();
        bob.append(fullName).append("\n\n");

    //Get Billing Address
        System.out.println("BILLING ADDRESS INFO \n");

        System.out.print("What is your Billing Street? ");
        String billingStreet = s.nextLine();

        System.out.print("What is your Billing City? ");
        String billingCity = s.nextLine();

        System.out.print("What is your Billing State? ");
        String billingState = s.nextLine();

        System.out.print("What is your Zip Code? ");
        String zipCode = s.nextLine();

        bob.append("BILLING ADDRESS\n\n")
                .append(billingStreet).append("\n")
                .append(billingCity).append(", ").append(billingState).append(" ").append(zipCode).append("\n\n");

    //Get Shipping Address
        System.out.println("SHIPPING ADDRESS INFO \n");

        System.out.print("What is the Shipping Street? ");
        String shippingStreet = s.nextLine();

        System.out.print("What is the Shipping City? ");
        String shippingCity = s.nextLine();

        System.out.print("What is the Shipping State? ");
        String shippingState = s.nextLine();

        System.out.print("What is the Shipping Zipcode? ");
        String shipZipcode = s.nextLine();

        bob.append("Shipping Address:").append("\n\n")
                .append(shippingStreet).append("\n")
                .append(shippingCity).append(", ").append(shippingState).append(" ").append(shipZipcode).append("\n");


        System.out.println("\nCustomer Information:");
        System.out.println(bob.toString());

    }
}
