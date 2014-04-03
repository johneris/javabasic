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
public class SpecialSeries {
    public static void main(String[] args)  {
        double[] nums = {1, 0.2, 0.3, 0.4, 0.5};
        
        for(double d : nums)    {
            System.out.println("double x: " + d);
            System.out.println("numTerms: " + 11);
            System.out.println("Sum of Special Series: " + sumOfSeries(d, 11));
            System.out.println();
        }
    }
    
    public static double sumOfSeries(double x, int numTerms)    {
        double sum = x;
        double numer = 1;
        double denom = 2;
        double numer_inc = 1;
        double denom_inc = 2;
        for(int i = 2; i <= numTerms; i++)  {
            if(i % 2 == 0)  {
                sum += (numer / denom);
                numer_inc += 2;
                denom_inc += 2;
                numer *= numer_inc;
                denom *= denom_inc;
            } else  {
                sum *= Math.pow(x, i) / i;
            }
        }
        return sum;
    }
}
