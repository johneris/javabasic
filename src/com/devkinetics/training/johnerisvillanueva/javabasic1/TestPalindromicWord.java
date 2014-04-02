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
public class TestPalindromicWord {
    public static void main(String[] args)  {
        String input;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter String: ");
        input = in.nextLine();
        
        String str = "";
        for(int i = 0; i < input.length(); i++) {
            if(Character.isLetter(input.charAt(i)))
                str += ("" + input.charAt(i)).toUpperCase();
        }
        
        boolean isPalindrome = true;
        for(int i = 0, j = str.length()-1; i < str.length(); i++, j--)   {
            if(str.charAt(i) != str.charAt(j))  {
                isPalindrome = false;
                break;
            }
        }
        
        System.out.println(input + (isPalindrome ? " is" : " is not") 
                + " a palindrome");
    }
}
