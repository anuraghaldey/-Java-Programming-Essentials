package Ch_5_LoopControlInstrcution;

public class BreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Break and continue using loops!
		for (int i = 0; i < 50; i++) {
			System.out.println(i);
			System.out.println("Java is great");
			if (i == 2) {
				System.out.println("Ending the loop");
				break;
			}
		}

		/*int i = 0;
		do {
			System.out.println(i);
			System.out.println("Java is great");
			if (i == 2) {
				System.out.println("Ending the loop");
				break;
			}
			i++;
		} while (i < 5);
		System.out.println("Loop ends here");*/

	}

}
