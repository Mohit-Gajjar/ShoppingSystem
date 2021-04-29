package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {
    private List<String> items = new ArrayList<>();
    private int totalCost;
    private int cartId;
    private String customerName;
    private int customerId;
    private int quantity = 0;

//    Class constructor
    public ShoppingCart(String customerName, int customerId){
        this.customerId = customerId;
        this.customerName = customerName;
    }
public void addItems(){
        S:
    while(1 != 0){
        System.out.println("=====================================================");
        System.out.println("What you would you like to do?");
        System.out.println("1.Add Items to the Cart.");
        System.out.println("2.Exit.");
        System.out.print("Enter the Choice: ");
        Scanner in = new Scanner(System.in);
        String choice = in.nextLine();
        if (choice.equals("1")){
            System.out.println("=====================================================");
            System.out.print("Enter the Item to be added to the cart: ");
            items.add(in.nextLine());
            System.out.print("Enter the Price: ");
            int price = in.nextInt();
            totalCost += price;
            quantity++;
            System.out.println("Item count: " + quantity);
            System.out.println("Items added....!");
            System.out.println("=====================================================");
        }else if (choice.equals("2")){
            System.out.println();
            System.out.println();
            showCart();
            System.out.println();
            System.out.println();
            System.out.println("What you would like to do?");
            System.out.println("1.Add more items to the cart.");
            System.out.println("2.Make Payment.");
            System.out.print("Enter the option: ");
            Scanner in1 = new Scanner(System.in);
            String choice1 = in1.next();
            if (choice1.equals("1")){
                continue S;
        }else if (choice1.equals("2")){
                Customer.makePayment(totalCost);
            }
    }
 }
    }
    public void showCart() {
        System.out.println("================================================");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Id: " + customerId);
        System.out.println("You have items in your Cart: ");
        for (int i = 0; i < items.size(); i++ ){
            System.out.println("\t > " + items.get(i));
        }
        System.out.println("Your Total Cost is " + totalCost + "/- Rs");
        System.out.println("================================================");
        }
}
