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
public class Hex2Dec {
    public static void main(String[] args)  {
        String hexStr;
        int dec = 0;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        hexStr = in.next();
        
        for(int i = 0; i < hexStr.length(); i++) {
            if(decEquivalent(hexStr.charAt(i)) == -1)  {
                System.out.println("Error: Invalid Hexadecimal String "
                        + "\"" + hexStr + "\"");
                return;
            }
        }
        
        int pow = hexStr.length()-1;
        for(int i = 0; i < hexStr.length(); i++) {
            dec += decEquivalent(hexStr.charAt(i)) * Math.pow(16, pow--);
        }
        
        System.err.println("The equivalent decimal number"
                + " for hexadecimal \"" + hexStr + "\" is " + dec);
    }
    
    public static int decEquivalent(char c) {
        if(Character.isDigit(c))    return c - '0';
        int val;
        if(Character.isUpperCase(c))    val = c - 'A' + 10;
        else if (Character.isLowerCase(c))    val = c - 'a' + 10;
        else val = 16;
        return (val >= 1 && val <= 15 ? val : -1);
    }
}
