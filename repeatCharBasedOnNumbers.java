package PracticeSept01_01;

import java.util.Scanner;

/*
Sample Input : a1bc3b2
Output : abcbcbcbb
*/

public class repeatCharBasedOnNumbers {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("Provide input string:");

		String inputValue = input.nextLine();

		String outputValue = "";

		int lengthOfInput = inputValue.length();

		int increment = 0, repeatCount = 0;

		StringBuilder repeatChar = new StringBuilder();

		System.out.println("Ouput Value: " + outputValue);

		for (; increment < lengthOfInput; increment++) {
			char ch = inputValue.charAt(increment);

			/*
			 * Append the character to be printed repeatedly
			 */
			if (isAlphabet(ch)) {
				repeatChar = repeatChar.append(ch);
			}

			/*
			 * Sum up the count to which character to be printed repeatedly
			 */
			if (isNumber(ch)) {
				repeatCount = repeatCount * 10 + (ch - '0');
			}
			/*
			 * Print if both numbers and characters are collected already and next character
			 * is new set of character again
			 */
			if ((repeatCount != 0) && (!(repeatChar.isEmpty())) && (increment < lengthOfInput - 1)) {

				if ((increment < lengthOfInput) && isAlphabet(inputValue.charAt(increment + 1))) {
					for (int i = 1; i <= repeatCount; i++) {
						System.out.print(repeatChar);
					}

					repeatChar.delete(0, repeatChar.length());
					repeatCount = 0;
				}
			}

		}

		/*
		 * Print the last set of characters taken from string
		 */
		if ((repeatCount != 0) && (!(repeatChar.isEmpty())) && (increment == lengthOfInput)) {
			for (int i = 1; i <= repeatCount; i++) {
				System.out.print(repeatChar);
			}
		}

		input.close();

	}

	/*
	 * Check if input character being passed is a number
	 */
	static boolean isNumber(char ch) {
		int num = ch - '0';
		if (num >= 0 && num <= 9) {
			return true;
		}
		return false;
	}

	/*
	 * Check if input character being passed is a alphabet
	 */
	static boolean isAlphabet(char ch) {
		int num = ch - '0';
		if (num >= 0 && num <= 9) {
			return false;
		}
		return true;
	}
}
