package Ch_9_AccessModifiers_Constructors;

class Squared {
	private int side;

	public Squared(int m) { // CONSTRUCTOR USED
		side = m;
	}

	public int getside() {
		return side;
	}

	public void setside(int s) {

		side = s;

	}

	public class SquareOperationUsingConstructor {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Squared neww = new Squared(4);
			System.out.println("SIDE IS: " + neww.getside());

		}

	}
}
