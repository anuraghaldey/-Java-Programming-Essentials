package Ch_9_AccessModifiers_Constructors;

import java.util.Scanner;

class Circle {
	private int diameter;// HERE ACCESS MODIFIER HIDES THE DATA, AND THE DATA CAN ONLY ACCESSED USING
							// GETTERS AND SETTERS!
	private int radius;
	private int area;
	private int circumference;

	public int getdiameter() {
		return diameter;
	}

	public void setdiameter(int d) {
		diameter = d;
	}

	public int getradius() {
		return radius;
	}

	public void setradius(int r) {
		r = diameter / 2;
		radius = r;
	}

	public int getarea() {
		return area;
	}

	public void setarea(int a) {
		a = (22 / 7) * radius * radius;
		area = a;
	}

	public int getcircumference() {
		return circumference;
	}

	public void setcircumference(int c) {
		c = 2 * (22 / 7) * radius;
		circumference = c;
	}
}

public class CircleOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle C1 = new Circle();// CREATION OF OBJECT

		System.out.println("<<<<<YOUR CIRCLE OPERATION>>>>");
		System.out.println(" ");
		System.out.println("ENTER DIAMETER OF YOUR CIRCLE:");
		Scanner input = new Scanner(System.in);
		int y = input.nextInt();
		System.out.println(" ");

		C1.setdiameter(y);
		System.out.println("DIAMETER = " + C1.getdiameter());

		System.out.println("");

		C1.setradius(y);
		System.out.println("RADIUS = " + C1.getradius());

		System.out.println(" ");

		C1.setarea(y);
		System.out.println("AREA = " + C1.getarea());

		System.out.println(" ");

		C1.setcircumference(y);
		System.out.println("CIRCUMFERENCE = " + C1.getcircumference());
		System.out.println(" ");

		System.out.println("OPERATION  FINISHED SUCCESSFULLY !!!");
	}

}
