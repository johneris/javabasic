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
public class SquareBoard {
    public static void main(String[] args)  {
        int size = 5;
        for(int row = 1; row <= size; row++)   {
            for(int col = 1; col <= size; col++)   {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
