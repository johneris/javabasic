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
public class Matrix {
    public static void printMatrix(int[][] m)   {
        for (int[] m1 : m) {
            for (int j = 0; j < m1.length; j++) {
                System.out.print(adjustString(m1[j]+""));
            }
            System.out.println();
        }
    }
    
    public static void printMatrix(double[][] m)   {
        for (double[] m1 : m) {
            for (int j = 0; j < m1.length; j++) {
                System.out.print(adjustString(m1[j]+""));
            }
            System.out.println();
        }
    }
    
    public static boolean haveSameDimension(int[][] m1, int[][] m2) {
        return (m1.length == m2.length && m1[0].length == m2[0].length);
    }
    
    public static boolean haveSameDimension(double[][] m1, double[][] m2) {
        return (m1.length == m2.length && m1[0].length == m2[0].length);
    }
    
    public static int[][] add(int[][] m1, int[][] m2)   {
        if(!haveSameDimension(m1, m2))  {
            System.err.println("Error: Matrices does not have " +
                    "the same dimension! Cannot add!");
            return null;
        }
        int[][] answer = new int[m1.length][m1[0].length];
        for(int i = 0; i < m1.length; i++)  {
            for(int j = 0; j < m1[0].length; j++)   {
                answer[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return answer;
    }
    
    public static double[][] add(double[][] m1, double[][] m2)   {
        if(!haveSameDimension(m1, m2))  {
            System.err.println("Error: Matrices does not have " +
                    "the same dimension! Cannot add!");
            return null;
        }
        double[][] answer = new double[m1.length][m1[0].length];
        for(int i = 0; i < m1.length; i++)  {
            for(int j = 0; j < m1[0].length; j++)   {
                answer[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return answer;
    }
    
    public static int[][] subtract(int[][] m1, int[][] m2)   {
        if(!haveSameDimension(m1, m2))  {
            System.err.println("Error: Matrices does not have " +
                    "the same dimension! Cannot subtract!");
            return null;
        }
        int[][] answer = new int[m1.length][m1[0].length];
        for(int i = 0; i < m1.length; i++)  {
            for(int j = 0; j < m1[0].length; j++)   {
                answer[i][j] = m1[i][j] - m2[i][j];
            }
        }
        return answer;
    }
    
    public static double[][] subtract(double[][] m1, double[][] m2)   {
        if(!haveSameDimension(m1, m2))  {
            System.err.println("Error: Matrices does not have " +
                    "the same dimension! Cannot subtract!");
            return null;
        }
        double[][] answer = new double[m1.length][m1[0].length];
        for(int i = 0; i < m1.length; i++)  {
            for(int j = 0; j < m1[0].length; j++)   {
                answer[i][j] = m1[i][j] - m2[i][j];
            }
        }
        return answer;
    }
    
    public static int[][] multiply(int[][] m1, int[][] m2)   {
        if(m1[0].length != m2.length)   {
            System.err.println("Error in matrices' dimension! " +
                    "Cannot multiply!");
            return null;
        }
        int[][] answer = new int[m2[0].length][m1.length];
        for(int i = 0; i < m2[0].length; i++)  {
            for(int j = 0; j < m1.length; j++)  {
                int sum = 0;
                for(int x = 0; x < m2.length; x++)   {
                    sum += m1[i][x] * m2[x][j];
                }
                answer[i][j] = sum;
            }
        }
        return answer;
    }
    
    public static double[][] multiply(double[][] m1, double[][] m2)   {
        if(m1[0].length != m2.length)   {
            System.err.println("Error in matrices' dimension! " +
                    "Cannot multiply!");
            return null;
        }
        double[][] answer = new double[m2[0].length][m1.length];
        for(int i = 0; i < m2[0].length; i++)  {
            for(int j = 0; j < m1.length; j++)  {
                double sum = 0;
                for(int x = 0; x < m2.length; x++)   {
                    sum += m1[i][x] * m2[x][j];
                }
                answer[i][j] = sum;
            }
        }
        return answer;
    }
    
    private static String adjustString(String s) {
        String str = "";
        int l = s.length();
        int blanks = 7 - l;
        for(int i = 1; i <= blanks; i++)    {
            str += " ";
        }
        str += s;
        return str;
    }
}