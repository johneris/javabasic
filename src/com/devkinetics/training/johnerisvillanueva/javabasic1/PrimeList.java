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
public class PrimeList {
    public static boolean isPrime(int posInt)  {
        for(int i = 2; i < posInt; i++) {
            if(posInt % i == 0)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args)  {
        int upperBound;
        List<Integer> prime = new ArrayList<Integer>();
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        upperBound = in.nextInt();
        
        for(int i = 1; i <= upperBound; i++)    {
            if(isPrime(i))    prime.add(i);
        }
        
        for(int p : prime)    System.out.println(p);
        
        System.out.println("\n[" + prime.size() + " primes found (" +
                (((double)prime.size()/(double)upperBound)*100) +"%)]");
        
    }
}
