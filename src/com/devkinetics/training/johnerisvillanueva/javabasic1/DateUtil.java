/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.devkinetics.training.johnerisvillanueva.javabasic1;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author John Eris
 */
public class DateUtil {
    public static String[] strMonths = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        };
    
    public static int[] daysInMonths = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
    
    public static String[] calendarDays =   {
            "Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"
        };
    
    public static boolean isLeapYear(int year)  {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }
    
    public static boolean isValidDate(int year, int month, int day) {
        if(!(year >= 1 && year <= 9999))    return false;
        if(!(month >= 1 && month <= 12))     return false;
        if( isLeapYear(year) && month == 2) {
            if(!(day >= 1 && day <= 29))    return false;
        } else  {
            if(!(day >= 1 && day <= daysInMonths[month-1]))    return false;
        }
        return true;
    }
    
    public static int getDayOfWeek(int year, int month, int day)    {
        int cent = ((year+"").charAt(0) - '0')*1000 + 
                   ((year+"").charAt(1) - '0')*100;
        if(cent == 1700)    cent = 4;
        if(cent == 1800)    cent = 2;
        if(cent == 1900)    cent = 0;
        if(cent == 2000)    cent = 6;
        if(cent == 2100)    cent = 4;
        if(cent == 2200)    cent = 2;
        if(cent == 2300)    cent = 0;
        if(cent == 2400)    cent = 6;
        
        int last2DigitYear =    ((year+"").charAt(2) - '0')*10 + 
                                ((year+"").charAt(3) - '0');
        
        int monthTable = 0;
        if(month == 1)  {
            if(isLeapYear(year))    monthTable = 6;
            else monthTable = 0;
        }
        if(month == 2)  {
            if(isLeapYear(year))    monthTable = 2;
            else monthTable = 3;
        }
        if(month == 3)  monthTable = 3;
        if(month == 4)  monthTable = 6;
        if(month == 5)  monthTable = 1;
        if(month == 6)  monthTable = 4;
        if(month == 7)  monthTable = 6;
        if(month == 8)  monthTable = 2;
        if(month == 9)  monthTable = 5;
        if(month == 10)  monthTable = 0;
        if(month == 11)  monthTable = 3;
        if(month == 12)  monthTable = 5;
        
        int dayOfWeek = (cent + last2DigitYear + (last2DigitYear/4) +
                monthTable + day) % 7;
        
        return dayOfWeek;
    }
    
    public static String toString(int year, int month, int day)    {
        return calendarDays[getDayOfWeek(year, month, day)] +
                " " + day + " " + strMonths[month-1] + 
                " " + year;
    }
    
    public static void main(String[] args)  {
        System.out.println("1990: " +isLeapYear(1900));
        System.out.println("2000: " +isLeapYear(2000));
        System.out.println("2011: " +isLeapYear(2011));
        System.out.println("2012: " +isLeapYear(2012));
        System.out.println();
        
        System.out.println(toString(2012, 2, 29) + " : " +isValidDate(2012, 2, 29));
        System.out.println(toString(2011, 2, 29) + " : " +isValidDate(2011, 2, 29));
        System.out.println(toString(2099, 12, 31) + " : " +isValidDate(2099, 12, 31));
        System.out.println(toString(2099, 12, 32) + " : " +isValidDate(2099, 12, 32));
        System.out.println();
        
        System.out.println(toString(1982, 4, 24) + " : " +calendarDays[getDayOfWeek(1982, 4, 24)]);
        System.out.println(toString(2000, 1, 1) + " : " +calendarDays[getDayOfWeek(2000, 1, 1)]);
        System.out.println(toString(2054, 6, 19) + " : " +calendarDays[getDayOfWeek(2054, 6, 19)]);
        System.out.println(toString(2012, 2, 17) + " : " +calendarDays[getDayOfWeek(2012, 2, 17)]);
        System.out.println();
        
        System.out.println(toString(2012, 2, 14));
        System.out.println();
        
        int year = 2014, month = 7, day = 11;
        Calendar cal = new GregorianCalendar(year, month-1, day);
        int dayNumber = cal.get(Calendar.DAY_OF_WEEK);
        
        System.out.println();
        System.out.println("" + toString(year, month, day));
        System.out.println("Gregorian Calendar: " + calendarDays[dayNumber-1]);
        System.out.println("DateUtil: " + 
                calendarDays[getDayOfWeek(year, month, day)]);
        
    }
}
