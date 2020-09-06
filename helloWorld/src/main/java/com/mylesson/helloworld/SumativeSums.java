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

        arraySum(arrayOfInts1);
        arraySum2(arrayOfInts2);
        arraySum3(arrayOfInts3);
    }

    public static void arraySum(int[] lengthOfArray) {
        int sum1 = 0;
        for (int i = 0; i < lengthOfArray.length; i++) {
            sum1 += lengthOfArray[i];
        }
        System.out.println("#1 Array Sum: " + sum1);
    }

    public static void arraySum2(int[] lengthOfArray2) {
        int sum2 = 0;
        for (int i = 0; i < lengthOfArray2.length; i++) {
            sum2 += lengthOfArray2[i];
        }
        System.out.println("#2 Array Sum:" + sum2);
    }

    public static void arraySum3(int[] lengthOfArray3) {
        int sum3 = 0;
        for (int i = 0; i < lengthOfArray3.length; i++) {
            sum3 += lengthOfArray3[i];
        }
        System.out.println("#3 Array Sum:" + sum3);
    }
}
