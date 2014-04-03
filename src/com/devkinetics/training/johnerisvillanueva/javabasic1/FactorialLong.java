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
public class FactorialLong {
    public static void main(String[] args)  {
        int n = 1;
        for(;;)    {
            long f = 1;
            for(long j = 1; j <= n; j++)  {
                if((Long.MAX_VALUE / f) < j+1)     {
                    System.out.println("The factorial of " + n + " "
                            + "is out of range");
                    System.exit(0);
                }
                f *= j;
            }
            System.out.println("The factorial of " + n + " is " + f);
            n++;
        }
    }
}
