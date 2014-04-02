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
public class ComputePI {
    public static void main(String[] args)  {
        double sum = 0;
        int maxDenom = 10000000;
        for(int denom = 1; denom <= maxDenom; denom+=2) {
            if(denom % 4 == 1)    {
                sum += (double)1 / (double)denom;
            } else if(denom % 4 == 3)   {
                sum -= (double)1 / (double)denom;
            } else  {
                System.out.println("The computer has gone crazy?!");
            }
        }
        sum *= 4;
        System.out.println("Computed PI: " + sum);
        System.out.println("Math.PI: " + Math.PI);
    }
}
