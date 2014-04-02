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
public class GradesStatistics {
    public static int[] grades;
    
    public static void main(String[] args)  {
        readGrades();
        System.out.println("The average is " + average());
        System.out.println("The minimum is " + min());
        System.out.println("The maximum is " + max());
        System.out.println("The standard deviation is " + stdDev());
    }
    
    public static void readGrades() {
        int numStudents;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        numStudents = in.nextInt();
        grades = new int[numStudents];
        
        for(int i = 0; i < numStudents; i++)   {
            do  {
                System.out.print("Enter the grade for student " + (i+1) + ": ");
                grades[i] = in.nextInt();
                if(grades[i] > 100 || grades[i] < 0)   
                    System.out.println("Invalid grade, try again...");
            } while(grades[i] > 100 || grades[i] < 0);
        }
        
    }
    
    public static double average()  {
        int sum = 0;
        double average;
        
        for(int i = 0; i < grades.length; i++)  {
            sum += grades[i];
        }
        average = (double)sum / (double)grades.length;
        
        return average;
    }
    
    public static int max() {
        int max = grades[0];
        
        for(int i = 0; i < grades.length; i++)  {
            if(max < grades[i])
                max = grades[i];
        }
        
        return max;
    }
    
    public static int min() {
        int min = grades[0];
        
        for(int i = 0; i < grades.length; i++)  {
            if(min > grades[i])
                min = grades[i];
        }
        
        return min;
    }
    
    public static double stdDev()   {
        double sum = 0;
        double variance = 0;
        double mean = average();
        
        for(int i = 0; i < grades.length; i++)  {
            sum += ((double)grades[i] - mean) * ((double)grades[i] - mean);
        }
        variance = sum / grades.length;
        
        return Math.sqrt(variance);
    }
}
