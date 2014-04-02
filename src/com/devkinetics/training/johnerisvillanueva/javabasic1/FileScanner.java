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
public class FileScanner {
    public static void main(String[] args) throws FileNotFoundException  {
        int num1;
        double num2;
        String name;
        double sum;
        
        Scanner in = new Scanner(new File("src\\com\\devkinetics\\training\\johnerisvillanueva\\javabasic1\\in.txt"));
        num1 = in.nextInt();
        num2 = in.nextDouble();
        name = in.next();
        
        System.out.println("The integer read is " + num1);
        System.out.println("The floating point number read is " + num2);
        System.out.println("The String read is \"" + name + "\"");
        
        sum = num1 + num2;
        System.out.println("Hi! " + name + ", " 
                + "the sum of " + num1 + " and " + num2 + " is " + sum);
    }
}
