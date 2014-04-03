/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.devkinetics.training.johnerisvillanueva.javabasic1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author John Eris
 */
public class PerfectPrimeFactorList {
    public static boolean isPrime(int posInt)  {
        for(int i = 2; i < posInt; i++) {
            if(posInt % i == 0)
                return false;
        }
        return true;
    }
    
    public static boolean isProductOfPrimeFactors(int posInt)   {
        int prod = 1;
        for(int i = 2; i < posInt; i++) {
            if(posInt % i == 0 && isPrime(i))
                prod *= i;
        }
        return (prod == posInt);
    }
    
    public static void main(String[] args)  {
        int upperBound;
        List<Integer> nums = new ArrayList<Integer>();
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        upperBound = in.nextInt();
        
        for(int i = 1; i <= upperBound; i++)    {
            if(isProductOfPrimeFactors(i))    nums.add(i);
        }
        
        System.out.println("These numbers are equal to the"
                + " product of prime factors:");
        for(int n : nums)    System.out.print(n + " ");
        
        System.out.println("\n[" + nums.size() + " numbers found (" +
                (((double)nums.size()/(double)upperBound)*100) +"%)]");
        
    }
}
