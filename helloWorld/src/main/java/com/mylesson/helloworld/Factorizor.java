/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylesson.helloworld;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jtooleyful
 */
public class Factorizor {
    public static void main(String[] args) {
        int int1;
        Scanner myScanner = new Scanner(System.in);
        String input;
        System.out.println("choose a number to factor");
        input = myScanner.nextLine();
        int1 = Integer.parseInt(input);
        factors(int1);
        }
    
    public static void factors(int userInput) {
        int factorsCounter = 0;
        int sumOfFactors = 0;
        System.out.print("The factors of " + userInput + " are ");
        for (int i = 1; i <= userInput; i++) {
            if (userInput % i == 0 && i != userInput) {
                System.out.print(i + ",");
                factorsCounter++;
                sumOfFactors += i;
            }
        }
        System.out.println(userInput);
        System.out.println("There are " + (factorsCounter + 1) + " factors of " + userInput);
        if (sumOfFactors == userInput && sumOfFactors > 1) {
            System.out.println(userInput + " is a perfect number.");
        } else {
            System.out.println(userInput + " is not a perfect number.");
        } 
        
        if (factorsCounter == 1){
            System.out.println(userInput + " is a prime number");
        } else {
            System.out.println(userInput + " is not a prime number");
        }
    }
}

