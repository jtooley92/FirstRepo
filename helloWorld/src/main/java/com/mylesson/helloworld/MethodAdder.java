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
public class MethodAdder {
    public static void main(String[] args) {
        addition(12, 16);
        System.out.println(addition(12, 16));
    }
    
    public static int addition(int a, int b){
        return a + b;
    }
}
