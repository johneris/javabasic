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
public class SumDigits {
    public static void main(String[] args)  {
        String digits;
        int sum;
        
        if(args.length != 1)    {
            System.err.println("Usage: java SumDigits <digits>");
            return;
        }
        digits = args[0];
        
        System.out.print("The sum of digits = " + digits.charAt(0));
        sum = digits.charAt(0) - '0';
        for(int i = 1; i < digits.length(); i++)   {
            System.out.print(" + " + digits.charAt(i));
            sum += digits.charAt(i) - '0';
        }
        
        System.out.println(" = " + sum);
        
    }
}
