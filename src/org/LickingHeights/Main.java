package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int dayOfWeek;
        int dayOfMonth;
        int month;
        String month2;
        int year;
        int yearOfCentury;
        int yearZeroBased;
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        System.out.println("What year were you born?");
        year = keyboard.nextInt();
        System.out.println("What month were you born?(put in a number)");
        month = keyboard.nextInt();
        int answer = monthThing(month, year);
        System.out.println(answer);
        System.out.println("Now, what month were you born?(Name of month this time)");
        month2 = keyboard.next();
        System.out.println("and what year were you born?(Name of year this time)");
        System.out.println(answer);
        int answer2 = monthThing(month, year);
    }

    public static int monthThing(int month, int year) {
        switch (month) {
            case 1:
                return 31;
            case 3:
                return 31;
            case 5:
                return 31;
            case 8:
                return 31;
            case 10:
                return 31;
            case 12:
                return 31;
            case 9:
                return 31;
            case 4:
                return 30;
            case 6:
                return 30;
            case 7:
                return 30;
            case 11:
                return 30;

            case 2:
                if (year % 4 == 0 || year % 400 == 0) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 0;
        }
    }



}