/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.devkinetics.training.johnerisvillanueva.javabasic1;

import java.util.Scanner;

/**
 *
 * @author John Eris
 */
public class KeyboardScanner {
    public static void main(String[] args)  {
        int num1;
        double num2;
        String name;
        double sum;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        num1 = in.nextInt();
        System.out.print("Enter a floating point number: ");
        num2 = in.nextDouble();
        System.out.print("Enter your name: ");
        name = in.next();
        
        sum = num1 + num2;
        System.out.println("Hi! " + name + ", " 
                + "the sum of " + num1 + " and " + num2 + " is " + sum);
    }
}
