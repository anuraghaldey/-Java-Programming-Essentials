package Ch_1_Variables_Datatypes;

import java.util.Scanner;

class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("STUDENT MARKS TO PERCENTAGE CALCULATOR AND RESULT STATUS PROVIDER");
		System.out.println(" ");

		System.out.println("YOUR SCORE CARD IS:");
		System.out.println("ENTER THE MARKS IN YOUR 1ST SUBJECT:");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println("ENTER THE MARKS IN YOUR 2ND SUBJECT: ");
		int b = input.nextInt();
		System.out.println("ENTER THE MARKS IN YOUR 3RD SUBJECT:");
		int c = input.nextInt();

		double t = 100;
		double a1 = a / t * 100;
		double b1 = b / t * 100;
		double c1 = c / t * 100;
		System.out.println("YOUR 1ST SUBJECT PERCENTAGE IS: " + a1 + "%");
		System.out.println("YOUR 2ND SUBJECT PRCENTAGE IS: " + b1 + "%");
		System.out.println("YOUR 3RD SUBJECT PERCENTAGE IS: " + c1 + "%");

		double sum = a + b + c;
		double total = t * 3;
		double totalpercent = (sum / total) * 100;
		System.out.println("YOUR OVERALL PERCENTAGE IS: " + totalpercent + "%");
		System.out.println(" ");

		System.out.println("YOUR RESULT STATUS WILL BE BASED UPON: ");
		System.out.println("OVERALL PERCENTAGE SHOULD BE GREATER THAN 40% ");
		System.out.println("PERCENTAGE OF EACH SUBJECT SHOULD BE GREATER THAN 33% IN ORDER TO PASS!");

		System.out.println("SO YOUR RESULT STATUS IS: ");
		if (a1 < 33.0) {
			System.out.println("YOU ARE FAILED!");
		} else if (b1 < 33.0) {
			System.out.println("YOU ARE FAILED!");

		} else if (c1 < 33.0) {
			System.out.println("YOU ARE FAILED! ");
		} else if (totalpercent < 40.0) {
			System.out.println("YOU ARE FAILED! ");
		} else {
			System.out.println("YOU ARE PASSED! ");
		}

	}

}
