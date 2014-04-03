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
public class NumberGuess {
    public static void main(String[] args)  {
        int secretNumber = (int)(Math.random()*100);
        int trials = 0;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Key in your guess: ");
        for(;;) {
            int guess = in.nextInt();
            trials++;
            if(guess > secretNumber)        System.out.println("Try lower");
            else if(guess < secretNumber)   System.out.println("Try higher");
            else    {
                System.out.println("You got it in " + trials + " trial" +
                        (trials == 1 ? "!" : "s!") );
                break;
            }
        }
    }
}
