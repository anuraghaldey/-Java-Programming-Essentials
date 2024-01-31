package Ch_6_Arrays;

import java.util.Scanner;

public class BinarySearch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = { 1, 3, 5, 7, 9, 11, 13 };
		System.out.println("ENTER YOUR INPUT NUMBER: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int li = 0;
		int hi = A.length - 1;
		int mi = (li + hi) / 2;
		while (li <= hi) {
			if (A[mi] == a) {
				System.out.println("ELEMENT IS PRESENT IS THE ARRAY AT " + mi + " INDEX POSITION");
				break;
			} else if (A[mi] < a) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}
	}

}
