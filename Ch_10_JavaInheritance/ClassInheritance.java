package Ch_10_JavaInheritance;

class Base {// PARENT CLASS
	int x;

	public int getX() {
		System.out.println("THE VALUE IS: ");
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

}

class Derived extends Base {// DERIVED CLASS USING THE KEYWORD EXTENDS,"CHILD CLASS".
	int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}

public class ClassInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived b = new Derived();// HERE OBJECT IS CREATED BY USING DERIVED CLASS BUT IT INHERITS
									// THE PROPERTIES
									// OF BASE CLASS
		b.setX(2);
		System.out.println(b.getX());

	}

}
