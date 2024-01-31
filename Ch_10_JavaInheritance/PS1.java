package Ch_10_JavaInheritance;

import java.util.Scanner;

class Circle {
	public int radius;
	public int area;

	public int getRadius() {
		return radius;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		area = radius * (22 / 7) * radius;

		this.area = area;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}

class Cylinder extends Circle {
	public int height;

	public int getVolume() {

		return volume;
	}

	public void setVolume(int volume, int h) {
		volume = (22 / 7) * radius * radius * height;
		this.volume = volume;
	}

	public int getTSA() {
		return TSA;
	}

	public void setTSA(int tSA, int g) {
		tSA = 2 * (22 / 7) * radius * (height + radius);
		TSA = tSA;
	}

	public int volume;
	public int TSA;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}

public class PS1 {

	public static void main(String[] args) {
		Cylinder C = new Cylinder();

		System.out.println("Enter the radius of the circle: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();

		System.out.println("Enter the height of the cylinder: ");
		int b = input.nextInt();

		C.setRadius(a);
		System.out.println("THE RADIUS OF THE CIRCLE IS:" + C.getRadius());

		C.setArea(a);
		System.out.println("AREA OF THE CIRCLE IS: " + C.getArea());

		C.setHeight(b);
		System.out.println("THE HEIGHT OF THE CIRCLE IS: " + C.getHeight());

		C.setVolume(a, b);
		System.out.println("THE VOLUME OF THE GIVEN CYLINDER IS: " + C.getVolume());

		C.setTSA(a, b);
		System.out.println("THE TSA OF THE GIVEN CYLINDER IS: " + C.getTSA());
	}

}
