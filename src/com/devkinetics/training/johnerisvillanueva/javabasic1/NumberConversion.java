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
public class NumberConversion {
    public static void main(String[] args)  {
        String num;
        int inRadix;
        int outRadix;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = in.next();
        System.out.print("Enter the input radix: ");
        inRadix = in.nextInt();
        System.out.print("Enter the output radix: ");
        outRadix = in.nextInt();
        
        System.out.println("\"" + num + "\" in radix " + inRadix + 
                " is \"" + toRadix(num, inRadix, outRadix) + 
                "\" in radix " + outRadix + ".");
    }
    
    public static String toRadix(String in, int inRadix, int outRadix)  {
        for(int i = 0; i < in.length(); i++) {
            if(decEquivalent(in.charAt(i)) == -1)  {
                System.out.println("Error: Maximum radix is 16");
                System.exit(0);
            }
        }
        int dec = toDecimal(in, inRadix);
        return toAnyRadix(dec, outRadix);
    }
    
    public static int toDecimal(String num, int radix)    {
        int dec = 0;
        int pow = num.length()-1;
        for(int i = 0; i < num.length(); i++) {
            dec += decEquivalent(num.charAt(i)) * Math.pow(radix, pow--);
        }
        return dec;
    }
    
    public static String toAnyRadix(int dec, int radix)   {
        String num = "";
        while(dec >= 0) {
            int remainder = dec % radix;
            dec /= radix;
            num += toChar(remainder);
            if(dec == 0)    break;
        }
        String rev = "";
        for(int i = num.length()-1; i >= 0; i--)   {
            rev += num.charAt(i);
        }
        return rev;
    }
    
    public static int decEquivalent(char c) {
        if(Character.isDigit(c))    return c - '0';
        int val;
        if(Character.isUpperCase(c))    val = c - 'A' + 10;
        else if (Character.isLowerCase(c))    val = c - 'a' + 10;
        else val = 16;
        return (val >= 1 && val <= 15 ? val : -1);
    }
    
    public static String toChar(int num)  {
        if(num >= 0 && num <= 9)    return num + "";
        if(num == 10)   return "A";
        if(num == 11)   return "B";
        if(num == 12)   return "C";
        if(num == 13)   return "D";
        if(num == 14)   return "E";
        if(num == 15)   return "F";
        return "MAX_RADIX_IS_16";
    }    
}
