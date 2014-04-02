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
public class CozaLozaWoza {
    public static void main(String[] args)  {
        
        for(int i = 1; i <= 110; i++)   {
            if(i % 3 == 0)  System.out.print("Coza");
            if(i % 5 == 0)  System.out.print("Loza");
            if(i % 7 == 0)  System.out.print("Woza");
            if(i % 3 != 0 && i % 5 != 0 && i % 7 != 0)  System.out.print(i);
            if(i % 11 == 0)  System.out.println();
            else System.out.print(" ");
        }
        
        System.out.println();
        
        for(int i = 1; i <= 110; i++)   {
            if(i % 3 == 0)  {
                System.out.print("Coza");
                if(i % 5 == 0)  {
                    System.out.print("Loza");
                    if(i % 7 == 0)  {
                        System.out.print("Woza");
                    }
                } else if(i % 7 == 0)  {
                    System.out.print("Woza");
                }
            }
            else if(i % 5 == 0)  {
                System.out.print("Loza");
                if(i % 7 == 0)  {
                    System.out.print("Woza");
                }
            }
            else if(i % 7 == 0)  System.out.print("Woza");
            else    System.out.print(i);
            if(i % 11 == 0)  System.out.println();
            else System.out.print(" ");
        }
    }
}