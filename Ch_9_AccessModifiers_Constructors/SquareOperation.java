package Ch_9_AccessModifiers_Constructors;

import java.util.Scanner;

class Square {
	private int side;
	private int area;
	private int perimeter;

	public int getside() {
		return side;
	}

	public void setside(int s) {
		side = s;
	}

	public int getarea() {
		return area;
	}

	public void setarea(int a) {
		a = side * side;
		area = a;
	}

	public int getperimeter() {
		return perimeter;
	}

	public void setperimeter(int p) {
		p = 4 * side;
		perimeter = p;
	}

}

public class SquareOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square S1 = new Square();
		System.out.println("<<<YOUR SQUARE OPERATION>>>");
		System.out.println("ENTER THE SIDE: ");
		Scanner input = new Scanner(System.in);
		int b = input.nextInt();

		System.out.println(" ");
		S1.setside(b);
		System.out.println("THE SIDE YOU ENTERED IS: " + S1.getside());
		System.out.println(" ");

		S1.setarea(b);
		System.out.println("THE AREA IS: " + S1.getarea());
		System.out.println(" ");

		S1.setperimeter(b);
		System.out.println("THE PERIMETER IS: " + S1.getperimeter());
		System.out.println("");

		System.out.println("YOUR OPERATION IS FINISHED SUCCESSFULLY!!");

	}

}
