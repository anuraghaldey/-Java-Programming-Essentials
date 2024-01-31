package Ch_4_ConditionalsInJava;

import java.util.Random;
import java.util.Scanner;

public class GameUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<<<GAME>>>");
		System.out.println("ENTER A NUMBER BETWEEN 0 TO 100:");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();

		Random random = new Random();
		int b = random.nextInt(101);

		if (a == b) {
			System.out.println("YOUR INPUT TO COMPUTER INPUT IS EQUAL");
		} else if (a > b) {
			System.out.println("YOUR INPUT IS GREATER THAN COMPUTER INPUT ");
		} else if (b > a) {
			System.out.println("YOUR INPUT IS SMALLER THAN COMPUTER INPUT");
		} else {
			System.out.println("FALSE INPUT");
		}

	}

}
