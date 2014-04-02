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
public class ReverseString {
    public static void main(String[] args)  {
        String inStr;
        int inStrLen;
        
        String strRev = "";
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        inStr = in.next();
        inStrLen = inStr.length();
        
        for(int i = inStrLen-1; i >= 0; i--)    {
            strRev += inStr.charAt(i);
        }
        
        System.out.println("The reverse of String \"" + inStr
                + "\" is \"" + strRev + "\"");
        
    }
}
