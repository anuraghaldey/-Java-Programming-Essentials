package Ch_7_MethodsInJava;

import java.util.Scanner;

public class Example3 {
	int A(int a, int b) {
		int c = a + b;
		return c;
	}

	double A(double a, double b) {
		return a * b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example3 obj = new Example3();

		System.out.println("YOUR INTEGER AND DECIMAL OPERATION ");
		System.out.println("ENTER 1st INTEGER:");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println("ENTER 2nd INTEGER");
		int b = input.nextInt();

		System.out.println("ENTER 1ST DECIMAL VALUE:");
		double c = input.nextDouble();
		System.out.println("ENTER 2nd DECIMAL VALUE:");
		double d = input.nextDouble();

		System.out.println("YOUR INT OPERATION IS: " + obj.A(a, b));
		System.out.println("YOUR DECIMAL OPERATION IS: " + obj.A(c, d));

	}

}
