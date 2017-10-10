package com.Inheritance.java;

//create extended Commercial class
public class Commercial extends Customer {
    //declare variables
    private static Double commercialRate = 5.0;
    private Boolean multiProperty;
    private Double calculatedTotal;

    //constructor for Commercial customer with added multiProperty field
    public Commercial(String customerName, String customerPhone, String customerAddress, Double squareFootage, Boolean multiProperty) {
        super(customerName, customerPhone, customerAddress, squareFootage);
        this.multiProperty = multiProperty;
    }

    //calculate and display output to user
    public void calculateCharges() {
        if (multiProperty){
            System.out.println("You are receiving a 10% multi property discount.");
            calculatedTotal = commercialRate * (squareFootage/1000) * .9;
        }
        else{
            calculatedTotal = commercialRate * (squareFootage/1000);
        }
        System.out.println(customerName);
        System.out.println(customerPhone);
        System.out.println(customerAddress);
        System.out.println(squareFootage);
        System.out.println("Your charges are: $" + calculatedTotal + " per week");
    }

}
