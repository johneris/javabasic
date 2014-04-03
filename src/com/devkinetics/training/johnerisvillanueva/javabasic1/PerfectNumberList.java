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
public class PerfectNumberList {
    public static boolean isPerfect(int posInt)  {
        int sumFactors = 0;
        for(int i = 1; i < posInt; i++) {
            if(posInt % i == 0)
                sumFactors += i;
        }
        return (sumFactors == posInt);
    }
    
    public static boolean isDeficient(int posInt)  {
        int sumFactors = 0;
        for(int i = 1; i < posInt; i++) {
            if(posInt % i == 0)
                sumFactors += i;
        }
        return (sumFactors < posInt);
    }
    
    public static void main(String[] args)  {
        int upperBound;
        List<Integer> perfect = new ArrayList<Integer>();
        List<Integer> neither = new ArrayList<Integer>();
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        upperBound = in.nextInt();
        
        for(int i = 1; i <= upperBound; i++)    {
            if(isPerfect(i))    perfect.add(i);
            else if(!isDeficient(i))    neither.add(i);
        }
        
        System.out.println("These numbers are perfect: ");
        for(int p : perfect)    System.out.print(p + " ");
        System.out.println("\n[" + perfect.size() + " perfect numbers found (" +
                (((double)perfect.size()/(double)upperBound)*100) +"%)]");
        
        System.out.println();
        System.out.println("These numbers are neither deficient nor perfect: ");
        for(int n : neither)    System.out.print(n + " ");
        System.out.println("\n[" + neither.size() + " numbers found (" +
                (((double)neither.size()/(double)upperBound)*100) +"%)]");
        
    }
}
