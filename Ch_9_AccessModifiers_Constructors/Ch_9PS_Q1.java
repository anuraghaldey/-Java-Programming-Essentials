package Ch_9_AccessModifiers_Constructors;

class cylinder {
	private int height;
	private int radius;

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
}

public class Ch_9PS_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cylinder C1 = new cylinder();
		int a = 12;
		int b = 13;
		C1.setradius(a);
		System.out.println("RADIUS IS: " + C1.getradius());

		System.out.println(" ");
		
		C1.setheight(b);
		System.out.println("HEIGHT IS: " + C1.getheight());
	}

}
