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
public class HarmonicSum {
    public static void main(String[] args)  {
        int maxDenominator = 50000;
        double sumL2R = 0;
        double sumR2L = 0;
        
        // L2R
        for(int denominator = 1; denominator <= maxDenominator; ++denominator)  {
            sumL2R += (double)1 / (double)denominator;
        }
        
        // R2L
        for(int denominator = maxDenominator; denominator >= 1; --denominator)  {
            sumR2L += (double)1 / (double)denominator;
        }
        double diff = Math.abs(sumL2R - sumR2L);
        
        System.out.println("L2R: " + sumL2R);
        System.out.println("R2L: " + sumR2L);
        System.out.println("diff: " + diff);
    }
}
