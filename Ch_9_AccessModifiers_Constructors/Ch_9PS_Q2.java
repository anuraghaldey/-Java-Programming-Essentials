package Ch_9_AccessModifiers_Constructors;

class Cylinder1 {
	private int height;
	private int radius;
	private int surfacearea;
	private int volume;

	public int getradius() {
		return radius;
	}

	public void setradius(int r) {
		radius = r;
	}

	public int getheight() {
		return height;

	}

	public void setheight(int h) {
		height = h;
	}

	public int getsurfacearea() {
		return surfacearea;
	}

	public void setsurfacearea(int s, int e) {
		s = 2 * (22 / 7) * radius * height + 2 * (22 / 7) * radius * radius;
		surfacearea = s;
	}

	public int getvolume() {

		return volume;
	}

	public void setvolume(int v, int k) {
		v = (22 / 7) * radius * radius * height;
		volume = v;
	}
}

public class Ch_9PS_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder1 C1 = new Cylinder1();
		int a = 12;
		int b = 10;
		C1.setradius(a);
		System.out.println("RADIUS IS: " + C1.getradius());

		System.out.println(" ");

		C1.setheight(b);
		System.out.println("HEIGHT IS: " + C1.getheight());
		System.out.println("");
		C1.setsurfacearea(a, b);
		System.out.println("SURFACE AREA IS: " + C1.getsurfacearea());
		System.out.println(" ");
		C1.setvolume(a, b);
		System.out.println("VOLUME IS: " + C1.getvolume());
	}

}
