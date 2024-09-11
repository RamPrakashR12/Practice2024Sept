/*
Input :
version1 : 1.2.03.045
version2 : 1.2.03.044

Output :
It is a Downgrade

*/
package PracticeSept01_01;

import java.util.Scanner;

public class VersionCheck {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Provide version 1 : ");

		String version1 = input.nextLine();

		System.out.println("Provide version 2 : ");

		String version2 = input.nextLine();

		String[] version01 = version1.split("\\.");
		String[] version02 = version2.split("\\.");

		int version1_lastvalue = 0, version2_lastvalue = 0, length = 0;

		if (version02.length > version01.length) {
			System.out.println("It is an Upgrade");
		} else if (version02.length < version01.length) {
			System.out.println("It is a Downgrade");
		} else {
			length = version01.length - 1;
			for (int i = 0; i <= length; i++) {
				version1_lastvalue = Integer.valueOf(version01[i]);
				version2_lastvalue = Integer.valueOf(version02[i]);

				if (version2_lastvalue > version1_lastvalue) {
					System.out.println("It is an Upgrade");
					break;
				} else if (version2_lastvalue < version1_lastvalue) {
					System.out.println("It is an Downgrade");
					break;
				}
				if (i == length) {
					System.out.println("No Change");
				}
			}
		}

		input.close();
	}
}
