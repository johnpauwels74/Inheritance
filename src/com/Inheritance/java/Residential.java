package com.Inheritance.java;

//create extended residential class
public class Residential extends Customer {
    //declare variables
    private static Double residentialRate = 6.0;
    private Boolean senior;
    private Double calculatedTotal;

    //constructor for Residential customer with added senior field
    public Residential(String customerName, String customerPhone, String customerAddress, Boolean senior, Double squareFootage) {
        super(customerName, customerPhone, customerAddress, squareFootage);
        this.senior = senior;
    }

    //calculate and display output to user
    public void calculateCharges() {
        if (senior){
            System.out.println("You are receiving a 15% senior citizen discount.");
            calculatedTotal = residentialRate * (squareFootage/1000) * .85;
        }
        else{
            calculatedTotal = residentialRate * (squareFootage/1000);
        }
        System.out.println(customerName);
        System.out.println(customerPhone);
        System.out.println(customerAddress);
        System.out.println(squareFootage);
        System.out.println("Your charges are: $" + calculatedTotal + " per week");
    }
}