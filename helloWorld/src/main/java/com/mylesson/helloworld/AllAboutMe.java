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
public class AllAboutMe {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String name;
        String favoriteFood;
        String pets;
        String residence;
        String interestingFact;

        System.out.println("My name is ");
        name = myScanner.nextLine();
        System.out.println("my favorite food is ");
        favoriteFood = myScanner.nextLine();
        System.out.println("I have   pets ");
        pets = myScanner.nextLine();
        System.out.println("I live ");
        residence = myScanner.nextLine();
        System.out.println("it is true ");
        interestingFact = myScanner.nextLine();
        
        System.out.println("My name is " + name);
        System.out.println("my favorite food is " + favoriteFood);
        System.out.println("I have " + pets + " pets");
        System.out.println("I live " + residence);
        System.out.println("it is true " +interestingFact);
    }
}
