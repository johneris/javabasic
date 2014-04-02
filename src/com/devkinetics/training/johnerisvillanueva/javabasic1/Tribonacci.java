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
public class Tribonacci {
    public static void main(String[] args)  {
        int n = 3;
        int fn;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        int fnMinus3 = 2;
        int nMax = 20;
        int sum = fnMinus1 + fnMinus2 + fnMinus3;
        
        double average;
        
        System.out.println("The first " + nMax  + " Fibonacci numbers are:");
        System.out.print(fnMinus1 + " " + fnMinus2 + " " + fnMinus3 + " ");
        
        while(n <= nMax) {
            fn = fnMinus1 + fnMinus2 + fnMinus3;
            System.out.print(fn + " ");
            sum += fn;
            fnMinus1 = fnMinus2;
            fnMinus2 = fnMinus3;
            fnMinus3 = fn;
            n++;
        }
        
        average = (double)sum / (double)nMax;
        System.out.println("\naverage: " + average);
    }
}
