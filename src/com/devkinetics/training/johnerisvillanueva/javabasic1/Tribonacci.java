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
        int n = 4;
        int fn;
        int fnMinus1 = 2;
        int fnMinus2 = 1;
        int fnMinus3 = 1;
        int nMax = 20;
        int sum = fnMinus3 + fnMinus2 + fnMinus1;
        
        double average;
        
        System.out.println("The first " + nMax  + " Fibonacci numbers are:");
        System.out.print(fnMinus3 + " " + fnMinus2 + " " + fnMinus1 + " ");
        
        while(n <= nMax) {
            fn = fnMinus3 + fnMinus2 + fnMinus1;
            System.out.print(fn + " ");
            sum += fn;
            fnMinus3 = fnMinus2;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
            n++;
        }
        
        average = (double)sum / (double)nMax;
        System.out.println("\naverage: " + average);
    }
}
