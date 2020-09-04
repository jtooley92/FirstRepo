/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylesson.helloworld;

import java.util.Random;

/**
 *
 * @author Jtooleyful
 */
public class Random1to10 {
    public static void main(String[] args){
        Random rng = new Random();
        int randomNumber = rng.nextInt(10) +1;
        System.out.println(randomNumber);
    }
}
