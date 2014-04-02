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
public class TimeTable {
    public static void main(String[] args)  {
        int max = 12;
        
        System.out.print(adjustString("*") + " | ");
        for(int n = 1; n <= max; n++)   {
            System.out.print(adjustString(n + "") + " ");
        }
        System.out.println();
        for(int n = 1; n <= max; n++)   {
            System.out.print("-------");
        }
        System.out.println();
        for(int n = 1; n <= max; n++)   {
            System.out.print(adjustString(n + "") + " | ");
            for(int multip = 1; multip <= max; multip++)    {
                System.out.print(adjustString((n*multip) + "") + " ");
            }
            System.out.println();
        }
    }
    
    public static String adjustString(String s) {
        String str = "";
        int l = s.length();
        int blanks = 5 - l;
        for(int i = 1; i <= blanks; i++)    {
            str += " ";
        }
        str += s;
        return str;
    }
}
