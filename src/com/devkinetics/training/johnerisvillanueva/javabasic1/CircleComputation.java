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
public class CircleComputation {
    public static void main(String[] args)  {
        double r;
        
        Scanner in =  new Scanner(System.in);
        System.out.print("Enter the radius: ");
        r = in.nextDouble();
        
        System.out.println("The area is " + (Math.PI*r*r));
        System.out.println("The perimeter is " + (2*Math.PI*r));
    }
}