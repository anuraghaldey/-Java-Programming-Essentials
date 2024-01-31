package Ch_9_AccessModifiers_Constructors;

import java.util.Scanner;

class Rectangle {
	private int length;
	private int breadth;
	private int area;
	private int perimeter;

	public int getlength() {

		return length;
	}

	public void setlength(int l) {
		length = l;
	}

	public int getbreadth() {

		return breadth;
	}

	public void setbreadth(int b) {
		breadth = b;
	}

	public int getarea() {

		return area;
	}

	public void setarea(int c, int g) {
		c = length * breadth;
		area = c;
	}

	public int getperimeter() {

		return perimeter;

	}

	public void setperimeter(int d, int u) {
		d = 2 * (length + breadth);
		perimeter = d;
	}

}

public class RectangleOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle R1 = new Rectangle();
		System.out.println("<<<<<<YOUR RECTANGLE OPERATIONS>>>>");

		System.out.println(" ");
		System.out.println("ENTER THE LENGTH OF THE RECTANGLE");
		Scanner input = new Scanner(System.in);
		int y = input.nextInt();
		System.out.println("ENTER THE BREADTH OF THE RECTANGLE");
		int z = input.nextInt();

		System.out.println(" ");
		R1.setlength(y);
		System.out.println("LENGTH OF RECTANGLE IS: " + R1.getlength());
		System.out.println(" ");
		R1.setbreadth(z);
		System.out.println("BREADTH OF RECTANGLE IS: " + R1.getbreadth());
		System.out.println(" ");
		R1.setarea(y, z);
		System.out.println("AREA  OF RECTANGLE IS: " + R1.getarea());
		System.out.println(" ");
		R1.setperimeter(y, z);
		System.out.println("THE PERIMETER OF RECTANGLE IS: " + R1.getperimeter());

		System.out.println(" ");
		System.out.println("OPERATION FINISHED SUCCESSFULLY!");
	}

}
