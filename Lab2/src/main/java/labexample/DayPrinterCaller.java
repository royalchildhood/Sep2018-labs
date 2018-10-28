package labexample;

import labexe1.DayPrinter;

public class DayPrinterCaller {

    public static void main(String[] args) {

		/**
		 * in order to use the class, we need to instantiate
         * This process is to create object from a class
         * you can create infinite object from a class
         * This process is called object level access
         */

        int year = 1997;
        int month = 2;
        int day = 31;
        // this line execute the class constructor
        DayPrinter myPrinter = new DayPrinter(year, month, day);

        /**
         * in order to access the method of the class, we need to use . to access.
         */
        myPrinter.basicPrint();
        myPrinter.prettyPrint();


        DayPrinter newPrinter = new DayPrinter(2000, 1, 31);
        newPrinter.prettyPrint();
    }
}
