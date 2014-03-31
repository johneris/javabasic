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
public class PrintDayInWord {
    public static void main(String[] args)  {
        int day = 0;
        
        if(day == 0)    {
            System.out.println("Sunday");
        } else if(day == 1)    {
            System.out.println("Monday");
        } else if(day == 2)    {
            System.out.println("Tuesday");
        } else if(day == 3)    {
            System.out.println("Wednesday");
        } else if(day == 4)    {
            System.out.println("Thursday");
        } else if(day == 5)    {
            System.out.println("Friday");
        } else if(day == 6)    {
            System.out.println("Saturday");
        } else  {
            System.out.println("Not a valid day");
        } 
        
        switch(day) {
            case 0 : System.out.println("Sunday"); break;
            case 1 : System.out.println("Monday"); break;
            case 2 : System.out.println("Tuesday"); break;
            case 3 : System.out.println("Wednesday"); break;
            case 4 : System.out.println("Thursday"); break;
            case 5 : System.out.println("Friday"); break;
            case 6 : System.out.println("Saturday"); break;
            default : System.out.println("Not a valid day");
        }
    }
}
