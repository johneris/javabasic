/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.devkinetics.training.johnerisvillanueva.javabasic1;

/**
 *
 * @author John Eris
 */
public class GreatestCommonDivisor {
    public static int gcd(int a, int b) {
        while(b != 0)   {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static void main(String[] args)  {
        int a, b;
        
        a = 5;
        b = 0;
        System.out.println("GCD(" + a + ", " + b + ") = " + gcd(a, b));
        
        a = 99;
        b = 88;
        System.out.println("GCD(" + a + ", " + b + ") = " + gcd(a, b));
        
        a = 3456;
        b = 1233;
        System.out.println("GCD(" + a + ", " + b + ") = " + gcd(a, b));
    }
}
