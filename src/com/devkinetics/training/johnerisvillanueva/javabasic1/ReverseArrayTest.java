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
public class ReverseArrayTest {
    public static void main(String[] args)   {
        int[] array = {12, 56, 34, 79, 26};
        
        System.out.print("int array:");
        for(int i = 0; i < array.length; i++)
            System.out.print(" " + array[i]);
        System.out.println();
        
        reverseArray(array);
        System.out.print("int array in reverse:");
        for(int i = 0; i < array.length; i++)
            System.out.print(" " + array[i]);
    }
    
    public static void reverseArray(int[] intArray) {
        for(int i = 0, j = intArray.length-1; 
                i < intArray.length/2; i++, j--)    {
            int temp = intArray[i];
            intArray[i] = intArray[j];
            intArray[j] = temp;
        }
    }
}
