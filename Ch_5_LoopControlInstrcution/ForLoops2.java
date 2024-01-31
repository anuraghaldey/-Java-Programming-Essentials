package Ch_5_LoopControlInstrcution;

public class ForLoops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 7; i > 0; i--) {
			if (i == 3) {
				break;// continue skips the rest statement and break stops it.
			}
			System.out.println(i);
		}
	}
}
