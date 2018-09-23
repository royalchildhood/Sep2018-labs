package com.royalchild.lab;

public class LeapYear {

    public static void main(String[] args) {
        // A leap year is a calendar year containing one additional day added to keep the calendar
        // year synchronized with the astronomical or seasonal year.
        // is Leap year practice here;

        // official answer
        int leapImport = 1600;

        boolean isLeapYear = (leapImport % 4 == 0) && (leapImport % 100 != 0);

        isLeapYear = isLeapYear || ( leapImport % 400 == 0 );

        System.out.print(isLeapYear);


//        int leapImport = 1600;
//        boolean isLeapYearFinalAnswer = false;
//
//        boolean isLeapYearCondition1 = (leapImport % 4 == 0);
//        boolean isLeapYearCondition2 = (leapImport % 100 != 0);
//        boolean isLeapYearCondition3 = ( leapImport % 400 == 0 );
//
//        isLeaisLeapYearFinalAnswer = (isLeapYearCondition1 && isLeapYearCondition2) || isLeapYearCondition3;

    }

}
