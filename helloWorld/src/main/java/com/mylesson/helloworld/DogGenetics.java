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
public class DogGenetics {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random rng = new Random();
        String name;
        String[] breeds = {"German Shepherd", "Bulldog", "Shi Tzu'", "Daschund", "Beagle"};
        int fullPercentBreed = 100;
        int breedPercent = 0;
        
        System.out.println("What is your dog's name");
        name = myScanner.nextLine();
        System.out.println("Well then i have this highly reliable report on " + name + "'s  prestigious background right here." + "\n" + name + " is:");
        
        for(int i=0; i<5; i++) {
            String breed = "";
            breed = breeds[i];
            if (i != 4) {
                breedPercent = rng.nextInt();
            }
        }
    }
}
