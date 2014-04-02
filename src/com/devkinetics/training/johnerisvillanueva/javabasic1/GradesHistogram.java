/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.devkinetics.training.johnerisvillanueva.javabasic1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author John Eris
 */
public class GradesHistogram {
    public static int[] grades;
    public static int[] bins = new int[10];
    public static String[] range = {" 0 -  9", "10 - 19", "20 - 29", 
                                    "30 - 39", "40 - 49", "50 - 59", 
                                    "60 - 69", "70 - 79", "80 - 89", 
                                    "90 - 100" };
    
    public static void main(String[] args) throws FileNotFoundException  {
        readGrades("src\\com\\devkinetics\\training\\johnerisvillanueva\\javabasic1\\grades.in");
        computeHistogram();
        printHistogramHorizontal();
        printHistogramVertical();
    }
    
    public static void readGrades(String filename) throws FileNotFoundException {
        int numStudents;
        Scanner in = new Scanner(new File(filename));
        
        numStudents = Integer.parseInt(in.nextLine());
        grades = new int[numStudents];
        for(int i = 0; i < numStudents; i++)   {
            grades[i] = in.nextInt();
        }
    }
    
    public static void computeHistogram()   { 
        for(int i = 0; i < grades.length; i++)  {
            if(grades[i] >= 0 && grades[i] <= 9)           bins[0]++;
            else if(grades[i] >= 10 && grades[i] <= 19)    bins[1]++;
            else if(grades[i] >= 20 && grades[i] <= 29)    bins[2]++;
            else if(grades[i] >= 30 && grades[i] <= 39)    bins[3]++;
            else if(grades[i] >= 40 && grades[i] <= 49)    bins[4]++;
            else if(grades[i] >= 50 && grades[i] <= 59)    bins[5]++;
            else if(grades[i] >= 60 && grades[i] <= 69)    bins[6]++;
            else if(grades[i] >= 70 && grades[i] <= 79)    bins[7]++;
            else if(grades[i] >= 80 && grades[i] <= 89)    bins[8]++;
            else if(grades[i] >= 90 && grades[i] <= 100)    bins[9]++;
        }
    }
    
    public static void printHistogramHorizontal()   {
        for(int i = 0; i < bins.length; i++)    {
            System.out.print(range[i] + ": ");
            for(int ct = 1; ct <= bins[i]; ct++)  {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void printHistogramVertical() {
        int maxct = maxCount();
        for(int ct = maxct; ct >= 1; ct--) {
            for(int i = 0; i < bins.length; i++)    {
                if(bins[i] >= ct)    
                    System.out.print("    *    ");
                else
                    System.out.print("         ");
            }
            System.out.println();
        }
        for(int i = 0; i < bins.length; i++)    {
            System.out.print(" " + range[i] + " ");
        }
    }
    
    public static int maxCount() {
        int max = bins[0];
        
        for(int i = 0; i < bins.length; i++)  {
            if(max < bins[i])
                max = bins[i];
        }
        
        return max;
    }
}