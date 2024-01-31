package Ch_6_Arrays;

public class ChangingArray {
	static void change(int a) {
		a = 56;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = { 12, 23, 24, 31, 14 };
		change(num[2]);
		System.out.println(num[2]);

	}

}
//Function Cant Change  an Array Directly.