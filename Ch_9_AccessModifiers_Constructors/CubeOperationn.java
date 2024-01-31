package Ch_9_AccessModifiers_Constructors;

import java.util.Scanner;

class Cube {
	private int side;
	private int facearea;
	private int surfacearea;
	private int lateralsurfacearea;
	private int volume;

	public int Getside() {
		return side;
	}

	public void Setside(int s) {
		side = s;
	}

	public int Getfacearea() {

		return facearea;

	}

	public void Setfacearea(int f) {
		f = side * side;
		facearea = f;
	}

	public int Getlateralsurfacearea() {
		return lateralsurfacearea;

	}

	public void Setlateralsurfacearea(int l) {
		l = 4 * (side * side);
		lateralsurfacearea = l;
	}

	public int Getvolume() {
		return volume;
	}

	public void Setvolume(int v) {
		v = side * side * side;
		volume = v;
	}

	public int Getsurfacearea() {
		return surfacearea;
	}

	public void Setsurfacearea(int ss) {
		ss = 6 * (side * side);
		surfacearea = ss;
	}

	public class CubeOperationn {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("<<<<<YOUR CUBE OPERATION>>>>>");
			System.out.println(" ");

			Cube C1 = new Cube();
			System.out.println("ENTER SIDE OF YOUR CUBE: ");
			Scanner input = new Scanner(System.in);
			int a = input.nextInt();
			System.out.println(" ");
			C1.Setside(a);
			System.out.println("THE SIDE YOU ENTERED IS: " + C1.Getside() + " m");
			System.out.println("");
			C1.Setfacearea(a);
			System.out.println("THE AREA OF SINGLE FACE OF YOUR CUBE IS: " + C1.Getfacearea() + " sq m.");
			System.out.println("");
			C1.Setsurfacearea(a);
			System.out.println("THE TOTAL SURFACE AREA OF CUBE IS: " + C1.Getsurfacearea() + " sq m.");
			System.out.println("");
			C1.Setlateralsurfacearea(a);
			System.out.println("THE LATERAL SURFACE AREA OF YOUR CUBE IS: " + C1.Getlateralsurfacearea() + " sq m.");
			System.out.println("");
			C1.Setvolume(a);
			System.out.println("THE VOLUME OF YOUR CUBE IS: " + C1.Getvolume() + " cube m.");

			if (C1.Getvolume() > 500) {
				System.out.println("YOUR CUBE IS BIG");
			} else if (C1.Getvolume() < 500 && C1.Getvolume() > 250) {
				System.out.println("YOUR CUBE IS SMALL");
			} else if (C1.Getvolume() < 250 && C1.Getvolume() > 125) {
				System.out.println("YOUR CUBE IS TOO SMALL");
			} else if (C1.Getvolume() < 125) {
				System.out.println("YOUR CUBE IS SMALLEST ");
			}

			System.out.println("");
			System.out.println("SO THIS WAS YOUR CUBE OPERATION, THANKYOU FOR YOUR INTEREST!");

		}
	}
}
