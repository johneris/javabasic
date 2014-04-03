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
public class Factorial1To10 {
    public static void main(String[] args)  {
        for(int n = 1; n <= 10; n++)    {
            int f = 1;
            for(int j = 1; j <= n; j++)  {
                f *= j;
            }
            System.out.println("The factorial of " + n + " is " + f);
        }
    }
}
