package Ch_9_AccessModifiers_Constructors;

class Rectangle1 {
	int length;
	int breadth;

	Rectangle1() {
		length = 12;
		breadth = 8;
	}

	Rectangle1(int l, int b) {
		length = l;
		breadth = b;
	}
}

public class Ch_9PS_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle1 R1 = new Rectangle1();
		System.out.println("LENGTH IS: " + R1.length);
		System.out.println("LENGTH IS: " + R1.breadth);

		Rectangle1 R2 = new Rectangle1(13, 10);
		System.out.println("THE NEW LENGTH IS :" + R2.length);
		System.out.println("THE NEW LENGTH IS :" + R2.length);
	}

}
