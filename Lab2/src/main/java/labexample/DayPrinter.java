package labexample;

public class DayPrinter {

	/**
     * Class global level variable to store the input parameter
     */
    public int year;
    public int month;
    public int day;

    // global boolean to determine whether we can do the print;
    public boolean printable;

    /**
     * This is constructor of the class, most important part of the class
     * Constructor has to have same name as the class name
     * Constructor can take parameters
     */
    public DayPrinter(int inputYear, int inputMonth, int inputDay) {
        year = inputYear;
        month = inputMonth;
        day = inputDay;

        // check value
        isPrintable();
    }

	/**
	 * This is the basic print method
     */
    public void basicPrint() {

        if (printable) {
            System.out.println(year + " " + month + " " + day);
        } else {
            System.out.println("Input value is wrong");
        }
    }

    /**
     * This is the pretty print method
     */
    public void prettyPrint() {

        if (printable) {
            System.out.println("Year " + year + " Month " + month + " Day " + day);
        } else {
            System.out.println("Input value is wrong");
        }
    }

	/**
     * This is the core logic of the class, to determine the printable value
     */
    private void isPrintable() {
        // condition one non negative
        if (year >= 0 && month >= 0 && day >= 0) {
            printable = true;

            // condition one non negative
            if (month == 1 || month == 3 || month == 5 ||
                month == 7 || month == 8 || month == 10 || month == 12) {

                if (day <= 31) {
                    printable = true;
                } else {
                    printable = false;
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11 ) {
                if (day <= 30) {
                    printable = true;
                } else {
                    printable = false;
                }
            } else if (month == 2) {

                boolean c1 = (year%4 == 0) && (year % 100 != 0);
                boolean isLeap = c1 || (year % 400 == 0);

                if (isLeap) {
                    if (day <= 28) {
                        printable = true;
                    }
                    else {
                        printable = false;
                    }
                } else {
                    if (day <= 29) {
                        printable = true;
                    }
                    else {
                        printable = false;
                    }
                }
            } else {
                // for other invalid month input
                printable = false;
            }
        } else {
            printable = false;
        }
    }
}
