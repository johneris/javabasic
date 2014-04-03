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
public class FibonacciInt {
    public static void main(String[] args)  {
        int n = 0;
        int fn;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        
        System.out.println("f(0) = " + fnMinus2);
        System.out.println("f(1) = " + fnMinus1);
        n = 2;
        
        for(;;) {
            if((Integer.MAX_VALUE - fnMinus1) < fnMinus2)
                break;
            fn = fnMinus2 + fnMinus1;
            System.out.println("f(" + n + ") = " + fn);
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
            n++;
        }
        System.out.println("f(" + n + ") is out of the range of int");
    }
}
