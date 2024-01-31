package Ch_6_Arrays;

import java.util.Scanner;

public class LinearSearch {

	// TODO Auto-generated method stub
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = { 1, 2, 3, 4, 5, 6 };
		System.out.println("ENTER YOUR INPUT NUMBER: ");
		Scanner input = new Scanner(System.in);
		int b = input.nextInt();
		for (int i = 0; i < A.length; i++) {
			if (b == A[i]) {
				System.out.println("THE NUMBER IS PRESENT  AT " + i + " INDEX POSITION");

			}
		}
	}

}
