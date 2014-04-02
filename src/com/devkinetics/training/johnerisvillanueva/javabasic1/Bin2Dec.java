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
public class Bin2Dec {
    public static void main(String[] args)  {
        String binStr;
        int dec = 0;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Binary string: ");
        binStr = in.next();
        
        for(int i = 0; i < binStr.length(); i++) {
            if(!("01".contains(""+binStr.charAt(i))))  {
                System.out.println("Error: Invalid Binary String "
                        + "\"" + binStr + "\"");
                return;
            }
        }
        
        int pow = binStr.length()-1;
        for(int i = 0; i < binStr.length(); i++) {
            dec += (binStr.charAt(i) == '0' ? 0 : 1) * Math.pow(2, pow--);
        }
        
        System.err.println("The equivalent decimal number"
                + " for binary \"" + binStr + "\" is " + dec);
    }
}
