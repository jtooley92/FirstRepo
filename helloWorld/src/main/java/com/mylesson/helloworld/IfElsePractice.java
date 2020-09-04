/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylesson.helloworld;

import java.util.Scanner;

/**
 *
 * @author Jtooleyful
 */
public class IfElsePractice {
    public static void main(String[] args) {
        int string1;
        String stringOperand1 = "";
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Choose a number between 1 and 6 ");
        stringOperand1 = myScanner.nextLine();
        string1 = Integer.parseInt(stringOperand1);

        if (string1 == 1) {
            System.out.println("you lose, pick again.");
        } else if (string1 == 2) {
            System.out.println("You win 1000 dollars!");
        } else if (string1 == 3) {
            System.out.println("Bad luck! A bee stung you!");
        } else if (string1 == 4) {
            System.out.println("You win a bag of candy!");
        } else if (string1 == 5) {
            System.out.println("You win eternal happiness! Congratulations!");
        } else if (string1 == 6) {
            System.out.println("Oh no! You have contracted covid-19");
        } else {
            System.out.println("Please choose a number between 1 and 6.");
        }

    }
}
