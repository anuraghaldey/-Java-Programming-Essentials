package Ch_6_Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

		int a = 5;
		int li = 0;
		int hi = arr.length - 1;
		int mi = (li + hi) / 2;
		while (li <= hi) {
			if (arr[mi] == a) {
				System.out.println("ELEMENT IS AT " + mi + " INDEX POSITION");
				break;
			} else if (arr[mi] < a) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;

		}
	}
}