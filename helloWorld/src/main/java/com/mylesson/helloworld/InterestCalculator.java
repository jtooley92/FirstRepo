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
public class InterestCalculator {
    public static void main(String[] args) {
        int howMuch;
        int howLong;
        Double growthPercent;
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.print("How much do you want to invest? ");
        input = sc.nextLine();
        howMuch = Integer.parseInt(input);
        System.out.println(input);
        System.out.print("How many years are you investing? ");
        input = sc.nextLine();
        howLong = Integer.parseInt(input);
        System.out.println(input);
        System.out.print("What is the annual interest rate % growth? ");
        input = sc.nextLine();
        growthPercent = Double.parseDouble(input);
        System.out.println(input);
        System.out.println("Calculating...");
        years(howLong, howMuch, growthPercent);
    }
    
    public static void years(int howLong, int howMuch, Double growthPercent ){
        double beganWith = howMuch ;
        double endedWith = beganWith * (1 + (growthPercent / 100));
        double earned = beganWith * (growthPercent / 100);
       
        for (int i = 1; i <= howLong; i++){
            if (i <= howLong){
                earned = beganWith * (growthPercent / 100);
                System.out.println("Year " +  i  +  ":");
                System.out.println("Began with " + (beganWith));
                System.out.println("Earned " + earned);
                System.out.println("Ended with " + endedWith + "\n");
                earned = beganWith * (growthPercent / 100);
                beganWith += earned;
                endedWith += earned;
            }
        }
    }
}
