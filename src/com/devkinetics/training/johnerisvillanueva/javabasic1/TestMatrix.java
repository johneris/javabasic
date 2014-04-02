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
public class TestMatrix {
    public static void main(String[] args)  {
        int[][] iAns;
        double[][] dAns;
        
        int[][] im1 = { {1, 2, 3, 4},
                        {0, -1, -2, 7},
                        {1, -3, 6, 5} };
        
        int[][] im2 = { {3, 2, 1, -3},
                        {4, 0, -2, 1},
                        {0, 1, 2, 4} };
        
        double[][] dm1 = {  {1, 2, 3, 4},
                            {0, -1, -2, 7},
                            {1, -3, 6, 5} };
        
        double[][] dm2 = {  {3, 2, 1, -3},
                            {4, 0, -2, 1},
                            {0, 1, 2, 4} };
        
        System.out.println("\nim1:");
        Matrix.printMatrix(im1);
        
        System.out.println("\nim2:");
        Matrix.printMatrix(im2);
        
        System.out.println("\ndm1:");
        Matrix.printMatrix(dm1);
        
        System.out.println("\ndm2:");
        Matrix.printMatrix(dm2);
        
        System.out.println("\nim1 and im2 - haveSameDimension: " +
                Matrix.haveSameDimension(im1, im2));
        
        System.out.println("\ndm1 and dm2 - haveSameDimension: " +
                Matrix.haveSameDimension(dm1, dm2));
        
        System.out.println("\nim1 + im2 = ");
        iAns = Matrix.add(im1, im2);
        Matrix.printMatrix(iAns);
        
        System.out.println("\nim1 - im2 = ");
        iAns = Matrix.subtract(im1, im2);
        Matrix.printMatrix(iAns);
        
        System.out.println("\ndm1 + dm2 = ");
        dAns = Matrix.add(dm1, dm2);
        Matrix.printMatrix(dAns);
        
        System.out.println("\ndm1 - dm2 = ");
        dAns = Matrix.subtract(dm1, dm2);
        Matrix.printMatrix(dAns);
        
        
        im1 = new int[][]{  {1, 2, 3},
                            {4, 5, 6} };
        
        im2 = new int[][]{  {7, 8},
                            {9, 10}, 
                            {11, 12} };
        
        System.out.println("\nim1 x im2 = ");
        iAns = Matrix.multiply(im1, im2);
        Matrix.printMatrix(iAns);
        
        dm1 = new double[][]{   {1, 2, 3},
                                {4, 5, 6} };
        
        dm2 = new double[][]{   {7, 8},
                                {9, 10}, 
                                {11, 12} };
        
        System.out.println("\ndm1 x dm2 = ");
        dAns = Matrix.multiply(dm1, dm2);
        Matrix.printMatrix(dAns);
    }
}
