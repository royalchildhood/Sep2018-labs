package stringExample;

public class StringExe {

	public static void printAllUpcaseLetterInString(String inputText) {
		for (int i = 0; i < inputText.length(); i++) {
			if (inputText.charAt(i) >= 'A' && inputText.charAt(i) <= 'Z') {
				System.out.print(inputText.charAt(i) + " ");
			}
		}
		System.out.println("");
	}

	public static void reverseString(String inputText) {
		String reverse = "";
		for (int i = inputText.length() - 1; i >= 0; i--) {
			reverse += inputText.charAt(i);
		}
		System.out.println(reverse);
	}

	public static void main(String[] args) {
		String testValue = "ASkkjsjZZhhIBIoQQ";

		printAllUpcaseLetterInString(testValue);
		reverseString(testValue);
	}
}


