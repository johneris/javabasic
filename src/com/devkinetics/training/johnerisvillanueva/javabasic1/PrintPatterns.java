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
public class PrintPatterns {
    public static void main(String[] args)  {
        System.out.println("\n(a)\n");
        printPatternA(9);
        System.out.println("\n(b)\n");
        printPatternB(9);
        System.out.println("\n(c)\n");
        printPatternC(9);
        System.out.println("\n(d)\n");
        printPatternD(9);
        System.out.println("\n(e)\n");
        printPatternE(9);
        System.out.println("\n(f)\n");
        printPatternF(9);
        System.out.println("\n(g)\n");
        printPatternG(9);
        System.out.println("\n(h)\n");
        printPatternH(9);
        System.out.println("\n(i)\n");
        printPatternI(9);
        System.out.println("\n(j)\n");
        printPatternJ(9);
        System.out.println("\n(k)\n");
        printPatternK(9);
        System.out.println("\n(l)\n");
        printPatternL(9);
        System.out.println("\n(m)\n");
        printPatternM(9);
        System.out.println("\n(n)\n");
        printPatternN(9);
        System.out.println("\n(o)\n");
        printPatternO(9);
        System.out.println("\n(p)\n");
        printPatternP(9);
        System.out.println("\n(q)\n");
        printPatternQ(9);
        System.out.println("\n(r)\n");
        printPatternR(9);
        System.out.println("\n(s)\n");
        printPatternS(9);
        System.out.println("\n(t)\n");
        printPatternT(9);
        System.out.println("\n(u)\n");
        printPatternU(9);
    }
    
    public static void printPatternA(int size)   {
        for(int i = 1; i <= size; i++)  {
            for(int j = 1; j <= i; j++) {
                System.out.print(" #");
            }
            System.out.println();
        }
    }
    
    public static void printPatternB(int size)   {
        for(int i = size; i >= 1; i--)  {
            for(int j = 1; j <= i; j++)  {
                System.out.print(" #");
            }
            System.out.println();
        }
    }
    
    public static void printPatternC(int size)   {
        for(int i = 1; i <= size; i++)   {
            for(int space = 0; space < i-1; space++) {
                System.out.print("  ");
            }
            for(int ct = 1; ct <= (size-i)+1; ct++) {
                System.out.print(" #");
            }
            System.out.println();
        }
    }
    
    public static void printPatternD(int size)   {
        for(int i = 1; i <= size; i++)   {
            for(int space = 0; space <= (size-i)-1; space++) {
                System.out.print("  ");
            }
            for(int ct = 0; ct < size-(size-i); ct++) {
                System.out.print(" #");
            }
            System.out.println();
        }
    }
    
    public static void printPatternE(int size)   {
        for(int i = 1; i <= size; i++)  {
            for(int j = 1; j <= size; j++)  {
                if(i == 1)          System.out.print(" #");
                else if(i == size)  System.out.print(" #");
                else if(j == 1)     System.out.print(" #");
                else if(j == size)  System.out.print(" #");
                else                System.out.print("  ");
            }
            System.out.println();
        }
    }
    
    public static void printPatternF(int size)   {
        for(int i = 1; i <= size; i++)  {
            for(int j = 1; j <= size; j++)  {
                if(i == 1)          System.out.print(" #");
                else if(i == size)  System.out.print(" #");
                else if(j == i)     System.out.print(" #");
                else                System.out.print("  ");
            }
            System.out.println();
        }
    }
    
    public static void printPatternG(int size)   {
        for(int i = 1; i <= size; i++)  {
            for(int j = 1; j <= size; j++)  {
                if(i == 1)          System.out.print(" #");
                else if(i == size)  System.out.print(" #");
                else if(j == (size-i)+1)     System.out.print(" #");
                else                System.out.print("  ");
            }
            System.out.println();
        }
    }
    
    public static void printPatternH(int size)   {
        for(int i = 1; i <= size; i++)  {
            for(int j = 1; j <= size; j++)  {
                if(i == 1)          System.out.print(" #");
                else if(i == size)  System.out.print(" #");
                else if(i == j)  System.out.print(" #");
                else if(j == (size-i)+1)     System.out.print(" #");
                else                System.out.print("  ");
            }
            System.out.println();
        }
    }
    
    public static void printPatternI(int size)   {
        for(int i = 1; i <= size; i++)  {
            for(int j = 1; j <= size; j++)  {
                if(i == 1)          System.out.print(" #");
                else if(i == size)  System.out.print(" #");
                else if(j == 1)     System.out.print(" #");
                else if(j == size)  System.out.print(" #");
                else if(i == j)  System.out.print(" #");
                else if(j == (size-i)+1)     System.out.print(" #");
                else                System.out.print("  ");
            }
            System.out.println();
        }
    }
    
    public static void printPatternJ(int size)   {
        for(int i = 1; i <= size; i++)   {
            for(int space = 0; space < i-1; space++) {
                System.out.print("  ");
            }
            for(int ct = 0; ct <= (size-i)-(i-1); ct++) {
                System.out.print(" #");
            }
            System.out.println();
        }
    }
    
    public static void printPatternK(int size)   {
        for(int i = 1; i <= (size/2)+1; i++)   {
            for(int space = 0; space <= (size/2-i); space++) {
                System.out.print("  ");
            }
            for(int ct = 0; ct < i+(i-1); ct++) {
                System.out.print(" #");
            }
            System.out.println();
        }
    }
    
    public static void printPatternL(int size)   {
        for(int i = 1; i <= (size/2)+1; i++)   {
            for(int space = 0; space <= (size/2-i); space++) {
                System.out.print("  ");
            }
            for(int ct = 0; ct < i+(i-1); ct++) {
                System.out.print(" #");
            }
            System.out.println();
        }
        for(int i = 1; i <= size; i++)   {
            if(i == 1)  continue;
            for(int space = 0; space < i-1; space++) {
                System.out.print("  ");
            }
            for(int ct = 0; ct <= (size-i)-(i-1); ct++) {
                System.out.print(" #");
            }
            System.out.println();
        }
    }
    
    public static void printPatternM(int size)   {
        for(int i = 1; i <= size; i++)  {
            for(int j = 1; j <= i; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
    
    public static void printPatternN(int size)   {
        for(int i = 1; i <= size; i++)   {
            for(int space = 0; space < i-1; space++) {
                System.out.print("  ");
            }
            for(int ct = 1; ct <= (size-i)+1; ct++) {
                System.out.print(" " + ct);
            }
            System.out.println();
        }
    }
    
    public static void printPatternO(int size)   {
        for(int i = 1; i <= size; i++)   {
            for(int space = 0; space <= (size-i)-1; space++) {
                System.out.print("  ");
            }
            for(int ct = size-(size-i); ct >= 1; ct--) {
                System.out.print(" " + ct);
            }
            System.out.println();
        }
    }
    
    public static void printPatternP(int size)   {
        for(int i = size; i >= 1; i--)  {
            for(int j = i; j >= 1; j--)  {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
    
    public static void printPatternQ(int size)   {
        for(int i = 1; i <= size; i++)   {
            for(int space = 0; space <= (size-i)-1; space++) {
                System.out.print("  ");
            }
            for(int ct = 1; ct <= size-(size-i); ct++) {
                System.out.print(" " + ct);
            }
            for(int ct = size-(size-i)-1; ct >= 1; ct--) {
                System.out.print(" " + ct);
            }
            System.out.println();
        }
    }
    
    public static void printPatternR(int size)   {
        String rev = "";
        for(int i = 1; i <= size; i++)   {
            String str = "";
            for(int space = 0; space <= (size-i)-1; space++) {
                str += "  ";
            }
            for(int ct = 1; ct <= size-(size-i); ct++) {
                str += " " + ct;
            }
            for(int ct = size-(size-i)-1; ct >= 1; ct--) {
                str += " " + ct;
            }
            str += "\n";
            String temp = str + rev;
            rev = temp;
        }
        System.out.println(rev);
    }
    
    public static void printPatternS(int size)   {
        for(int i = 1; i <= size; i++)  {
            for(int j = 1; j <= i; j++) {
                System.out.print(" " + j);
            }
            for(int space = 0; space <= ((size-i)-1)*2; space++) {
                System.out.print("  ");
            }
            for(int ct = size-(size-i); ct >= 1; ct--) {
                if(ct == size)  continue;
                System.out.print(" " + ct);
            }
            System.out.println();
        }
    }
    
    public static void printPatternT(int size)   {
        String rev = "";
        for(int i = 1; i <= size; i++)  {
            String str = "";
            for(int j = 1; j <= i; j++) {
                str += (" " + j);
            }
            for(int space = 0; space <= ((size-i)-1)*2; space++) {
                str += ("  ");
            }
            for(int ct = size-(size-i); ct >= 1; ct--) {
                if(ct == size)  continue;
                str += (" " + ct);
            }
            str += "\n";
            String temp = str + rev;
            rev = temp;
        }
        System.out.println(rev);
    }
    
    public static void printPatternU(int size)   {
        for(int i = 1; i <= size; i++)   {
            for(int space = 0; space <= (size-i)-1; space++) {
                System.out.print("  ");
            }
            int num = size-(size-i);
            String rside = "";
            for(int ct = size-(size-i); ct >= 1; ct--) {
                System.out.print(" " + num);
                if(ct != 1) {
                    String str = " " + num;
                    String temp = str + rside;
                    rside = temp;
                }
                num = (num+1) == 10 ? 0 : num+1;
            }
            System.out.println(rside);
        }
    }
}
