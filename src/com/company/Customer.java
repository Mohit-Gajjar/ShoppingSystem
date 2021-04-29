package com.company;

import java.util.Scanner;

public class Customer {
    private static String name;
    private static int cid;

//    Class Constructor
    public Customer(String name, int cid){
        this.cid = cid;
        this.name = name;
    }

//Function for getting the bill and the payment information
    public static void makePayment(int totalCostToPay){
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("The Bill is of " + totalCostToPay + "/- Rs");
        S:
        System.out.print("Pay the bill: ");
        Scanner input = new Scanner(System.in);
        int paid = input.nextInt();
        if (paid > totalCostToPay){
            System.out.println("Payment Success.....!");
            System.out.println("Thank you for Shopping from us, Have a Nice Day");
        }else {
            System.out.println("You have not paid the full bill.");
            int sum = totalCostToPay - paid;
            System.out.println("You have to pay " + sum + " /- Rs more.");
        }
        System.out.println("--------------------------------------------------------------------------");
    }
}
