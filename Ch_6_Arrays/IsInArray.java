package Ch_6_Arrays;

import java.util.Scanner;

public class IsInArray {
	public static void main(String[] args) {
		int[] NUM = { 12, 34, 78, 35 };
		System.out.println("ENTER A NUMBER! ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		boolean ISINARRAY = false;

		for (int element : NUM) {
			if (a == element) {
				ISINARRAY = true;
				break;
			}
		}

		if (ISINARRAY) {
			System.out.println("THE VALUE IS IN THE ARRAY! ");
		} else {
			System.out.println("THE VALUE IS NOT IN THE ARRAY");
		}

	}

}
