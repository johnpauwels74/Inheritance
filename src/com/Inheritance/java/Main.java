package com.Inheritance.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // declare variables
        String input;
        String variable1;
        String variable2;
        String variable3;
        Double squarefootage;
        Boolean variable4;
        Scanner sc = new Scanner(System.in);
        int NumberEntered;
        boolean end = false;

        //begin loop to prompt user for input
        while (end == false) {
            System.out.println("1. Commercial");
            System.out.println("2. Residential");
            System.out.println("3. Done");
            System.out.println("Please enter an option from 1 - 3");
            input = sc.nextLine();
            try {
                NumberEntered = Integer.parseInt(input);
            } catch (Exception e){
                e.printStackTrace();
            }
            NumberEntered = Integer.parseInt(input);

            switch (NumberEntered) {
                case 1:
                    System.out.println("Commercial");
                    System.out.println("Please enter the customer name: ");
                    input = sc.nextLine();
                    try {
                        variable1 = String.valueOf(input);
                    } catch (Exception e){
                    e.printStackTrace();
                    }
                    variable1 = String.valueOf(input);
                    System.out.println("Please enter the customer phone number: ");
                    input = sc.nextLine();
                    try {
                        variable2 = String.valueOf(input);
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                    variable2 = String.valueOf(input);
                    System.out.println("Please enter the customer address: ");
                    input = sc.nextLine();
                    try {
                        variable3 = String.valueOf(input);
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                    variable3 = String.valueOf(input);
                    System.out.println("Please enter the square footage of the property: ");
                    input = sc.nextLine();
                    try {
                        squarefootage = Double.parseDouble(input);
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                    squarefootage = Double.parseDouble(input);
                    System.out.println("Please type true if there is a multi-property discount: ");
                    input = sc.nextLine();
                    try {
                        input = String.valueOf(input);
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                    input = String.valueOf(input);
                    if (input.equals("true") || input.equals("t") || input.equals("T")) {
                        variable4 = true;
                    } else {
                        variable4 = false;
                    }
                    //instantiate Commercial customer and call output method
                    Commercial comcust = new Commercial(variable1, variable2, variable3, squarefootage, variable4);
                    comcust.calculateCharges();
                    break;
                case 2:
                    System.out.println("Residential");
                    System.out.println("Please enter the customer name: ");
                    input = sc.nextLine();
                    try {
                        variable1 = String.valueOf(input);
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                    variable1 = String.valueOf(input);
                    System.out.println("Please enter the customer phone number: ");
                    input = sc.nextLine();
                    try {
                        variable2 = String.valueOf(input);
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                    variable2 = String.valueOf(input);
                    System.out.println("Please enter the customer address: ");
                    input = sc.nextLine();
                    try {
                        variable3 = String.valueOf(input);
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                    variable3 = String.valueOf(input);
                    System.out.println("Please enter the square footage of the property: ");
                    input = sc.nextLine();
                    try {
                        squarefootage = Double.parseDouble(input);
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                    squarefootage = Double.parseDouble(input);
                    System.out.println("Please type true if there is a senior citizen discount: ");
                    input = sc.nextLine();
                    try {
                        input = String.valueOf(input);
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                    input = String.valueOf(input);
                    if (input.equals("true") || input.equals("t") || input.equals("T")) {
                        variable4 = true;
                    } else {
                        variable4 = false;
                    }
                    //instantiate Residential customer and call output method
                    Residential rescust = new Residential(variable1, variable2, variable3, variable4, squarefootage);
                    rescust.calculateCharges();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    end = true;
                    break;
                default:
                    System.out.println("Invalid entry. Please enter a number between 1 and 5.");
            }
        }
    }
}
