/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.devkinetics.training.johnerisvillanueva.javabasic1;

import java.util.Scanner;

/**
 *
 * @author John Eris
 */
public class PrintTriangles {
    public static void main(String[] args)  {
        int rows;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        rows = in.nextInt();
        
        printPowerOf2Triangle(rows);
        printPascalTriangle1(rows);
        printPascalTriangle2(rows);
    }
    
    public static void printPowerOf2Triangle(int rows)  {
        for(int r = 1; r <= rows; r++)   {
            for(int space = 0; space <= (rows-r)-1; space++) {
                System.out.print(adjustString(""));
            }
            int num = 1;
            String rside = "";
            for(int ct = rows-(rows-r); ct >= 1; ct--) {
                System.out.print(adjustString(""+num));
                if(ct != 1) {
                    String str = adjustString(""+num);
                    String temp = str + rside;
                    rside = temp;
                }
                num *= 2;
            }
            System.out.println(rside);
        }
    }
    
    public static void printPascalTriangle1(int rows)   {
        int[][] pascal = pascal(rows);
        for(int i = 0; i < rows; i++)   {
            for(int j = 0; j < i; j++)   {
                System.out.print(adjustString(""+pascal[i][j]));
            }
            System.out.println();
        }
    }
    
    public static void printPascalTriangle2(int rows)   {
        int[][] pascal = pascal(rows);
        for(int i = 0; i < rows; i++)   {
            int spaces = (rows-i)/2;
            for(int space = 0; space < spaces; space++) {
                System.out.print(adjustString(""));
            }
            if(i%2 != 0)    System.out.print("   ");
            for(int j = 0; j < i; j++)   {
                System.out.print(adjustString(""+pascal[i][j]));
            }
            System.out.println();
        }
    }
    
    private static int[][] pascal(int rows) {
        int[][] pascal = new int[rows][rows];
        pascal[0][0] = 1;
        pascal[1][0] = 1;
        pascal[1][1] = 1;
        for(int i = 2; i < rows; i++)   {
            for(int j = 0; j < i; j++)   {
                if(j == 0)  pascal[i][j] = 1;
                else if(j == i-1)   pascal[i][j] = 1;
                else pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
            }
        }
        return pascal;
    }
    
    private static String adjustString(String s) {
        String str = "";
        int l = s.length();
        int blanks = 6 - l;
        for(int i = 1; i <= blanks; i++)    {
            str += " ";
        }
        str += s;
        return str;
    }
}
