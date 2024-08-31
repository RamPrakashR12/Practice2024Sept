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
			if (isAlphabet(ch)) {
				repeatChar = repeatChar.append(ch);
			}

			if (isNumber(ch)) {
				repeatCount = repeatCount * 10 + (ch - '0');
			}
			/*
			 * System.out.println("ch: " + ch); System.out.println("repeatChar: " +
			 * repeatChar); System.out.println("repeatCount: " + repeatCount);
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
		if ((repeatCount != 0) && (!(repeatChar.isEmpty())) && (increment == lengthOfInput)) {
			for (int i = 1; i <= repeatCount; i++) {
				System.out.print(repeatChar);
			}
		}

		input.close();

	}

	static boolean isNumber(char ch) {
		int num = ch - '0';
		if (num >= 0 && num <= 9) {
			return true;
		}
		return false;
	}

	static boolean isAlphabet(char ch) {
		int num = ch - '0';
		if (num >= 0 && num <= 9) {
			return false;
		}
		return true;
	}
}
