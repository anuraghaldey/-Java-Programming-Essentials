package Ch_6_Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 423098, 612, 134, 9304, 845 };
		int t = 0;
		int m;
		// BUBBLE SORT
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				m = j + 1;
				if (arr[j] > arr[m]) {
					t = arr[j];
					arr[j] = arr[m];
					arr[m] = t;
				}

			}}
		
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);

		}

	}

}
