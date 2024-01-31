package Ch_4_ConditionalsInJava;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENTER 0 FOR ROCK, 1 FOR PAPER, 2 FOR SCISSOR :");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		if (a == 0) {
			System.out.println("YOU = ROCK");
		} else if (a == 1) {
			System.out.println("YOU =PAPER");
		} else if (a == 2) {
			System.out.println("YOU =SCISSOR");
		} else {
			System.out.println("INCORRECT INPUT");
		}

		Random F = new Random();
		int b = F.nextInt(3);
		if (b == 0) {
			System.out.println("COMMPUTER = ROCK");
		} else if (b == 1) {
			System.out.println("COMPUTER =PAPER ");

		} else if (b == 2) {
			System.out.println("COMPUTER =  SCISSOR ");
		}

		if (a == b) {
			System.out.println("DRAW!!");
		} else if (a == 0 && b == 1 || a == 1 && b == 2 || b == 0 && a == 2) {
			System.out.println("YOU LOST ");
		} else if (a == 1 && b == 0 || a == 2 && b == 1 || a == 0 && b == 2) {
			System.out.println("YOU WON CONGRATULATIONS");
		}

	}

}
