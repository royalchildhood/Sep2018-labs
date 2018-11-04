package arrayExample;

public class ArrayExe {

	public static void findMaxItemInArray(int[] inputArray) {
		int max = -1;

		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] >= max) {
				max = inputArray[i];
			}
		}
		System.out.println("The max item of the given list is: " + max);
	}

	public static void findMinItemInArray(int[] inputArray) {
		int min = 9999;

		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] <= min) {
				min = inputArray[i];
			}
		}
		System.out.println("The min item of the given list is: " + min);
	}

	public static void findAvgOfArray(int[] inputArray) {
		double sum = 0;

		for (int i = 0; i < inputArray.length; i++) {
			sum += inputArray[i];
		}
		System.out.println("The avg of the given list is: " + sum/inputArray.length);
	}

	public static void main(String[] args) {
		int[] testArray = {3,5,12,5,23,9,7,6};

		findMaxItemInArray(testArray);
		findMinItemInArray(testArray);
		findAvgOfArray(testArray);
	}
}
