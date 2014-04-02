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
public class PhoneKeyPad {
    public static void main(String[] args)  {
        String[] keypad = {"", "", "ABC", "DEF", "GHI", "JKL",
            "MNO", "PQRS", "TUV", "WXYZ"};
        
        String input;
        String output = "";
        System.out.print("Enter series of characters: ");
        Scanner in = new Scanner(System.in);
        
        input = in.next().toUpperCase();
        for(int i = 0; i < input.length(); i++) {
            for(int k = 2; k < keypad.length; k++)    {
                if(keypad[k].contains(input.charAt(i) + ""))   
                    output += k;
            }
        }
        
        System.out.println("The corresponding phone keypad for "
                + "input is " + output);
    }
}
