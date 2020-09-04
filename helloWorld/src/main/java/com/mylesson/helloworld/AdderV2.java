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
public class AdderV2 {
    public static void main(String[] args) { 
        int sum;
        int operand1;
        int operand2;
        String stringOperand1 = "";
        String stringOperand2 = "";
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Please enter the first number to be added:" );
        stringOperand1 = myScanner.nextLine();
        System.out.println("Please enter the second number to be added:");
        stringOperand2 = myScanner.nextLine();
        
        operand1 = Integer.parseInt(stringOperand1);
        operand2 = Integer.parseInt(stringOperand2);
        sum = operand1 + operand2;
        
        System.out.println("Sum is " + sum);
    }
}
