package com.Inheritance.java;

//create Customer class
public class Customer {
    //declare variables
    public String customerName;
    public String customerPhone;
    public String customerAddress;
    public Double squareFootage;

    //constructor for customer with all variables
    public Customer(String customerName, String customerPhone, String customerAddress, Double squareFootage) {
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.customerAddress = customerAddress;
        this.squareFootage = squareFootage;
    }
}