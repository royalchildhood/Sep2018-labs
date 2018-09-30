package com.royalchild.assignment.answer.assignment.answers;

public class GetDaysInMonth {

	/**
	 *
	 * Days of Month
	 *
	 * Now that we know the way to print out the Days in a week
	 * Let do days in a Month now.
	 *
	 * Given a input value between 1 to 12 and given a input year
	 * print out how many days exist in that given month
	 *
	 * hint: Feb in leap year has 29 days
	 *
	 *
	 * expect: e.g. input 7 and 2010 should print 31
	 * 				input 2 and 2000 should print 29
	 *
	 */
	public static void main(String[] args) {

		// the testing value should be between 1 to 12
		int inputMonth = 2;
		// the testing year value should be between valid year format
		int inputYear = 2001;

		if (inputMonth == 1 || inputMonth == 3 || inputMonth == 5 ||
			inputMonth == 7 || inputMonth == 8 || inputMonth == 10 || inputMonth == 12) {
			System.out.print(31);
		} else if (inputMonth == 2) {
			boolean isLeapYear = ((inputYear % 4 == 0) && (inputYear % 100 != 0)) || ( inputYear % 400 == 0 );
			if (isLeapYear) {
				System.out.print(29);
			} else {
				System.out.print(28);
			}
		} else {
			System.out.print(30);
		}
	}
}
