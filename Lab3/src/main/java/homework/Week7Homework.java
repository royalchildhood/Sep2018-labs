package homework;

public class Week7Homework {

	public static void filterOutGarbage(String inputValue) {

		for (int i = 0; i < inputValue.length(); i++) {
			char target = inputValue.charAt(i);
			if( (target>=65 && target<=90) || (target>=97 && target<=122)) {
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
}
