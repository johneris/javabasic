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
public class SumAndAverage {
    public static void main(String[] args)  {
        int sum = 0;
        double average;
        int lowerbound = 1;
        int upperbound = 100;
        
        for(int number = lowerbound; number <= upperbound; ++number)    {
            sum += number;
        }
        average = (double) sum / (double) ((upperbound - lowerbound) + 1);
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
        
        int number = lowerbound;
        sum = 0;
        while(number <= upperbound) {
            sum += number;
            ++number;
        }
        average = (double) sum / (double) ((upperbound - lowerbound) + 1);
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
        
        number = lowerbound;
        sum = 0;
        do {
            sum += number; 
            ++number;
        } while(number <= upperbound);
        average = (double) sum / (double) ((upperbound - lowerbound) + 1);
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
        
    }
}
