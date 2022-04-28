package ru.skypro;
import java.time.Year;
import java.util.Arrays;

public class MyFunction {
    public static void main(String[] args) {...}


    // Задача 1
    public static void printIsLeapYear(int year) {
        boolean leapYear = ((year % 4) == 0) && ((year % 100) != 0 || (year % 400) == 0);
        ;
        if (leapYear) {
            System.out.println(year + " высокосный год");
        } else {
            System.out.println(year + " не высокосный год");

        }
    }
}
