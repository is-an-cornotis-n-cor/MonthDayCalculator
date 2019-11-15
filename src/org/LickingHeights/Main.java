package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int dayOfWeek;
        int dayOfMonth;
        int month;
        int year;
        int yearOfCentury;

        int zellerCongurenceThing;
        int answer4;
        Scanner keyboard;
        keyboard = new Scanner(System.in);


        do {


            System.out.println("Monday's child is fair of face,\n" +
                    "Tuesday's child is full of grace,\n" +
                    "Wednesday's child is full of woe,\n" +
                    "Thursday's child has far to go.\n" +
                    "Friday's child is loving and giving,\n" +
                    "Saturday's child works hard for a living,\n" +
                    "But the child born on the Sabbath Day,\n" +
                    "Is fair and wise and good in every way.");
            System.out.println("What year were you born?");
            year = keyboard.nextInt();
            System.out.println("What month were you born?(put in a number)");
            month = keyboard.nextInt();
            System.out.println("What is the day that you were born?");
            dayOfMonth = keyboard.nextInt();
            int answer = amountOfDaysinMonth(month, year);
            System.out.println("There are " + answer + " days in the month");


            int answer2 = ZellerCongurence(month, year, dayOfMonth);
            System.out.println(answer2);

            String answer3 = MonthPoem(answer2);
            System.out.println(answer3);
            System.out.println("Do you want to go again? If yes type 1, if no type 2.");

            answer4 = keyboard.nextInt();

        } while (answer4 == 1);
    }

    public static int amountOfDaysinMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 8:
            case 9:
            case 10:
            case 12:
                return 31;


            case 4:
            case 6:
            case 7:
            case 11:
                return 30;

           default:
                if (year % 4 == 0 || year % 400 == 0) {
                    return 29;
                } else {
                    return 28;
                }

        }
    }

    public static int ZellerCongurence(int month, int year, int dayOfMonth) {

        if (month == 1 || month == 2) {
            month = (month + 12);
            year--;

        }
        int yearZeroBased;
        yearZeroBased = (year / 100);
        int zellerCongurenceThing;
        zellerCongurenceThing = 13 * (month + 1);
        int yearOfCentury;
        yearOfCentury = (year % 100);


        int dayOfWeek;
        dayOfWeek = ((dayOfMonth + ((zellerCongurenceThing)/ 5) + yearOfCentury + (yearOfCentury / 4) + ((yearZeroBased) / 4) - (2 * (yearZeroBased))) % 7);
        return dayOfWeek;
    }

    public static String MonthPoem(int dayOfWeek) {
        if (dayOfWeek == 1) {
            return "You were born on a Monday \n" +
                    "According to the poem you are fair of face ";
        } else if (dayOfWeek == 2) {
            return "You were born on a Tuesday \n" +
                    "According to the poem you are full of grace ";
        } else if (dayOfWeek == 3) {
            return "You were born on a Wednesday \n" +
                    "According to the poem you are full of woe ";
        } else if (dayOfWeek == 4) {
            return "You were born on a Thursday \n" +
                    "According to the poem you have far of go ";
        } else if (dayOfWeek == 5) {
            return "You were born on a Friday \n" +
                    "According to the poem you are loving and giving";
        } else if (dayOfWeek == 6) {
            return "You were born on a Saturday \n" +
                    "According to the poem you work hard for a living";
        } else {
            return "You were born on the Sabbath Day \n" +
                    "According to the poem you are fair and wise in every way ";
        }


    }
}

