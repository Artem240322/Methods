package ru.skypro;

import java.time.LocalDate;
import java.time.Year;
import java.util.Arrays;

public class MyFunction {
    public static void main(String[] args) {
        printIsLeapYear(2020);
        printVersion(1, 2015);
        System.out.println("Дней для доставки" + calculateDeliveryDays(90));
        validateString("abc");
        validateString("abcc");

        int [] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(arr));
    }

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

/// задача 2
    public static void printVersion (int clientOS, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && deviceYear < currentYear)
            System.out.println("Установите облегченную версию для IOS ");
        else if (clientOS == 0 && deviceYear >= currentYear)
            System.out.println("Установите версию для IOS ");
        else if (clientOS == 1 && deviceYear < currentYear)
            System.out.println("Установите облегченную версию для Android ");
        else
            System.out.println("Установите версию для Android ");

    }

    /// Задача 3

    public static int calculateDeliveryDays(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays ++;
        }
        if (deliveryDistance > 60) {
            deliveryDays ++;
        }
        if (deliveryDistance > 80) {
            deliveryDays ++;
        }
        return deliveryDays;

    }

    // ЗАДАЧА 4

    public static void validateString(String str) {
        int flag = 0;
        char symbol = 0;
        for (int i = 0; i < str.length() - 1; i++)
            if (str.charAt(i) == str.charAt(i + 1)) {
                symbol = str.charAt(i);
                flag = 1;
                break;
            }
        if(flag ==1 ) {
            System.out.println("Дубликат найден " + symbol);
            }
        else
            System.out.println("Дубликат не найден ");
    }

    /// ЗАДАЧА 5

    public  static void rovertArroy(int[] arr) {
        for (int i=0; i < arr.length; i++) {
            arr[i] = arr[arr.length - 1 - i];
        }
    }
}

