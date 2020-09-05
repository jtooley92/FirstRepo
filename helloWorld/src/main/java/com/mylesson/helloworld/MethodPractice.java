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
public class MethodPractice {
    public static void main(String[] args) {
        int y = 1;
        int x = 2;
        randomVariable(y, x);
        System.out.println(randomVariable(y, x));
        int num = randomVariable(y, x);
        System.out.println(num);
        nothing();
        colors("blue");
        System.out.println(colors("yellow"));
    } 
    
    public static int randomVariable(int a, int b) {
        return a;
       
    }
    
    public static String colors(String yellow) {
        System.out.println("red");
        return yellow;
    }
    
    public static void nothing() {
        System.out.println("hello");
    }
}
