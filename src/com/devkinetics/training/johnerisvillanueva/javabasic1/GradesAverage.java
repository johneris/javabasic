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
public class GradesAverage {
    public static void main(String[] args)  {
        int numStudents;
        int[] grades;
        int sum = 0;
        double average;
        
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
        
        for(int i = 0; i < grades.length; i++)  {
            sum += grades[i];
        }
        average = (double)sum / (double)numStudents;
        
        System.out.println("The average is " + average);
    }
}
