/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylesson.helloworld;

/**
 *
 * @author Jtooleyful
 */
public class SumativeSums {

    public static void main(String[] args) {
        int[] arrayOfInts1 = {1, 90, -33, -55, 67, -16, 28, -55, 15};
        int[] arrayOfInts2 = {999, -60, -77, 14, 160, 301};
        int[] arrayOfInts3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
            140, 150, 160, 170, 180, 190, 200, -99};

        System.out.println("#1 Array Sum: " + arraySum(arrayOfInts1));
        System.out.println("#2 Array Sum: " + arraySum(arrayOfInts2));
        System.out.println("#2 Array Sum: " + arraySum(arrayOfInts3));
    }

    public static int arraySum(int[] lengthOfArray) {
        int sum1 = 0;
        for (int i = 0; i < lengthOfArray.length; i++) {
            sum1 += lengthOfArray[i];
        } 
        return sum1;
    }
}
