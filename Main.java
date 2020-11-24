package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cost = new Scanner(System.in);
        double price;
        double dollars;

        do {
            System.out.print("How much does the customer have to pay? ");
            price = cost.nextDouble();
        } while (price <= 0.00);
        Scanner given = new Scanner(System.in);
        System.out.print("How much does the customer give the cashier? ");
        dollars = given.nextDouble();

        double change = (dollars - price);
        System.out.println("Your change is: " + change);
        int cents = (int) Math.round( change* 100);

        if(cents == 0){
            System.out.println(" You will be given 0 coins ");
        } else if (change <0){
            System.out.println(" You need to give " +(change*-1) +" more");
        }else if (cents > 0){
            coins(cents);}

                }
                 static double coins(int changeA){
                     int quarter = 25; int nickel = 5; int dime = 10; int penny = 1;

                     int qamount = changeA / quarter;
                     int qcoins = changeA-(qamount * quarter);
                     int damount = qcoins/ dime;
                     int dcoins = changeA - ((qamount * quarter) + (damount*dime));
                     int namount = dcoins / nickel;
                     int ncoins = changeA - ((qamount * quarter) + (damount*dime) + (namount*nickel));
                     int pamount = ncoins / penny;
                     int coinNum =(qamount + pamount +damount +namount);
                    System.out.println("You will be given " + coinNum + " coins" );
                    return coinNum;
                }
            }
