package Ch_4_ConditionalsInJava;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		System.out.println("ROCK PAPER SCISSORS GAME! ENJOY!! HAVE FUN!!!");
		System.out.println("ENTER YOUR INPUT");
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER 0 FOR ROCK,1 FOR PAPER,2 FOR SCISSORS");
		int a = scanner.nextInt();

		Random random = new Random();
		int CI = random.nextInt(3);
		System.out.println("YOU= " + a);
		System.out.println("COMPUTER= " + CI);
		if (a == CI) {
			System.out.println("ITS A DRAW!!!");
		} else if (a == 0 && CI == 2 || a == 1 && CI == 0 || a == 2 && CI == 1) {
			System.out.println("YOU HAVE WON THE GAME, CONGRATULATIONS!!");
		} else if (a == 2 && CI == 0 || a == 0 && CI == 1 || a == 1 && CI == 0) {
			System.out.println("YOU HAVE LOST THE GAME!!");

		}

	}
}
