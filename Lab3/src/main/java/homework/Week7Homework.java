package homework;

import java.util.Arrays;

public class Week7Homework {

	public static void filterOutGarbage(String inputValue) {

		for (int i = 0; i < inputValue.length(); i++) {
			char target = inputValue.charAt(i);
			if( (target>='A' && target<='Z') || (target>=97 && target<=122)) {
				System.out.print(inputValue);
			}
		}
	}

	public static void isPalindrome(String inputValue) {

		boolean isPalindrome = true;

		for (int i =0; i < inputValue.length()/2 ; i++) {
			if (inputValue.charAt(i) != inputValue.charAt(inputValue.length() - 1 - i)) {
				isPalindrome = false;
				break;
			}
		}

		System.out.println(inputValue + " is " + isPalindrome + " palindrome");
	}

	public static void classAverage(Student[] studentlist) {
		int sum = 0;

		for (int i = 0; i < studentlist.length; i ++ ) {
			sum += studentlist[i].finalScore;
		}

		System.out.println(sum/studentlist.length);
	}

	public static void main(String[] args) {

		boolean notWin = true;
		int[] winning = {3, 6, 18, 33, 38, 47};
		double counter = 0;

		while (notWin) {
			boolean same = isSame(winning, rand());

			if (same) {
				break;
			} else {
				counter++;
			}
		}

		double rate = (1/counter) * 100;
		System.out.print(rate);

	}

	public static int[] rand() {
		int[] myLottyNumber = new int[6];

		for (int i = 0; i < myLottyNumber.length; i ++) {
			myLottyNumber[i] = 1 + (int)(Math.random() * 49 );

			boolean randomNumberAgain = true;

			if ( i >= 1) {
				while(randomNumberAgain) {
					int counter = i;
					for (int j = i - 1; j >=0; j-- ) {
						if (myLottyNumber[i] == myLottyNumber[j]) {
							myLottyNumber[i] = 1 + (int)(Math.random() * ((49 - 1) + 1));
							break;
						} else {
							counter--;
						}
					}
					if (counter == 0) {
						randomNumberAgain = false;
					}
				}
			}
		}

		Arrays.sort(myLottyNumber);
//		for (int i = 0; i < myLottyNumber.length; i ++) {
//			System.out.print(myLottyNumber[i] + " ");
//		}

		return myLottyNumber;
	}

	public static boolean isSame(int[] win, int[] my) {
		for (int i = 0; i < win.length; i++) {
			if (win[i] != my[i]) {
				return false;
			}
		}
		return true;
	}

}
