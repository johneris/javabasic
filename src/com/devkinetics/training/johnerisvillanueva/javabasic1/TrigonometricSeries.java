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
public class TrigonometricSeries {
    public static void main(String[] args)  {
        double[] nums = {0, 4, Math.PI/6, Math.PI/4, Math.PI/3, Math.PI/2};
        
        for(double n : nums)    {
            System.out.println("double x: " + n);
            System.out.println("my sin: " + sin(n, 10));
            System.out.println("Math.sin: " + Math.sin(n));
            System.out.println("my cos: " + cos(n, 10));
            System.out.println("Math.cos: " + Math.cos(n));
            System.out.println();
        }
    }
    
    public static double sin(double x, int numTerms)    {
        double sin = x;
        int denom = 3;
        for(int i = 2; i <= numTerms; i++)  {
            if(i % 2 == 0)  sin -= avoidOverflow(x, denom);
            else sin += avoidOverflow(x, denom);
            denom += 2;
        }
        return sin;
    }
    
    public static double cos(double x, int numTerms)    {
        double cos = 1;
        int denom = 2;
        for(int i = 2; i <= numTerms; i++)  {
            if(i % 2 == 0)  cos -= avoidOverflow(x, denom);
            else cos += avoidOverflow(x, denom);
            denom += 2;
        }
        return cos;
    }
    
    private static double avoidOverflow(double x, int num)    {
        double ans = 1;
        for(int n = num; n >= 1; n--) {
            ans *= (double)x / (double)n;
        }
        return ans;
    }
    
}
