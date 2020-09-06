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
public class HealthyHearts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        int maxHeartRate;
        double minTarget;
        double maxTarget;
        
        System.out.println("What is your age? ");
        age = sc.nextInt();
        System.out.println(age);
        maxHeartRate = 220 - age;
        minTarget = .5 * maxHeartRate;
        maxTarget = .85 * maxHeartRate;
        System.out.println("Your maximum heart rate should be " + maxHeartRate + " beats per minute");
        System.out.println("Your target HR zone is " + minTarget + " - " + maxTarget + " beats per minute");
    }
}
