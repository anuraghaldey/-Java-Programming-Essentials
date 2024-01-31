package Ch_6_Arrays;

public class HighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = { 12, 345, 2234, 567, 2, 7, 8 };
		int highest = A[0];
		for (int i = 1; i < A.length; i++) {
			if (A[i] > highest) {
				highest = A[i];
			}
		}
		System.out.println(highest);
	}

}
