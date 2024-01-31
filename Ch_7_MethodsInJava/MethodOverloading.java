package Ch_7_MethodsInJava;

import java.util.Scanner;

public class MethodOverloading {

	static int multiply(int a, int b) {
		return a * b;
	}

	static double multiply(double a, double b) {
		return a * b;
	}

	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading();
		System.out.println("ENTER 1ST NUMBER :");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println("ENTER 2ND NUMBER: ");
		int b = input.nextInt();
		System.out.println("ENTER 1ST DECIMAL VALUE ");
		double d = input.nextDouble();
		System.out.println("ENTER 2ND DECIMAL VALUE");
		double e = input.nextDouble();

		int c = obj.multiply(a, b);
		double f = obj.multiply(d, e);
		System.out.println("Mutiply method : returns integer : " + c);
		System.out.println("Mutiply method : returns double : " + d);
	}
}