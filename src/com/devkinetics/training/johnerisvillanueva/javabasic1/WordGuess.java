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
public class WordGuess {
    public static void main(String[] args)  {
        String word = "";
        
        if(args.length == 1)    {
            word = args[0];
        } else  {
            word = "Amazing";
        }
        
        boolean[] bGuess = new boolean[word.length()];
        int trials = 0;
        
        Scanner in = new Scanner(System.in);
        
        for(;;) {
            System.out.print("Key in one character or your guess word: ");
            String guess = in.nextLine();
            trials++;
            
            if(guess.length() > 1) {
                if(guess.equalsIgnoreCase(word))
                    for(int i = 0; i < bGuess.length; i++)
                        bGuess[i] = true;
            } else  {
                for(int i = 0; i < word.length(); i++)  {
                    if(guess.equalsIgnoreCase(word.charAt(i)+""))
                        bGuess[i] = true;
                }
            }
            
            System.out.print("Trial " + trials + ": ");
            for(int i = 0; i < word.length(); i++)  {
                if(bGuess[i])   System.out.print(" " + word.charAt(i));
                else    System.out.print(" _");
            }
            System.out.println();
            
            if(endGame(bGuess))  {
                System.out.println("Congratulations! You got it in " + 
                        trials + " trial" + (trials == 1 ? "!" : "s!") );
                break;
            }
        }
        
    }
    
    private static boolean endGame(boolean[] bool) {
        for(boolean b : bool)
            if(!b)  return false;
        return true;
    }
}
