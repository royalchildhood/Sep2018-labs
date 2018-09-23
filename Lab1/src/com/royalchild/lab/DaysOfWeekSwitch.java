package com.royalchild.lab;

public class DaysOfWeekSwitch {
    public enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args) {
        // assume the range is 1 to 7;
        int day = 7;

        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3 ) {
            System.out.println("Wed");
        } else if (day == 4 ) {
            System.out.println("Thur");
        } else if (day == 5 ) {
            System.out.println("Fri");
        } else if (day == 6 ) {
            System.out.println("Sat");
        } else {
            System.out.println("Sun");
        }
    }
}
