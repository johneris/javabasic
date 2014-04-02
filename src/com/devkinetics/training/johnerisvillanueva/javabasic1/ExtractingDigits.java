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
public class ExtractingDigits {
    public static void main(String[] args)  {
        int n = 12345;
        while(n > 0)    {
            int digit = n % 10;
            System.out.print(digit);
            n = n / 10;
            if(n > 0)   System.out.print(",");
        }
    }
}
