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
public class CheckOddEven {
    public static void main(String[] args)  {
        int number = 2;
        System.out.println("The number is " + number);
        if(number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
