/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.devkinetics.training.johnerisvillanueva.javabasic1;

/**
 *
 * @author John Eris
 */
public class CheckerBoard {
    public static void main(String[] args)  {
        int size = 7;
        
        for(int row = 1; row <= size; row++)    {
            if( (row % 2) == 0) {
                System.out.print(" ");
            }
            for(int col = 1; col <= size; col++)    {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
