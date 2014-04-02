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
public class Hex2Bin {
    public static void main(String[] args)  {
        String[] hexBits = {"0000", "0001", "0010", "0011",
                            "0100", "0101", "0110", "0111",
                            "1000", "1001", "1010", "1011",
                            "1100", "1101", "1110", "1111"};
        
        String hexStr;
        String binStr = "";
        
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
        
        for(int i = 0; i < hexStr.length(); i++) {
            binStr += hexBits[decEquivalent(hexStr.charAt(i))] + " ";
        }
        
        System.err.println("The equivalent binary"
                + " for hexadecimal \"" + hexStr + "\" is " + binStr);
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