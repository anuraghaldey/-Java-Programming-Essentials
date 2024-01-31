package Ch_10_JavaInheritance;

class Base12 { //// Parent Class
	Base12() {
		System.out.println("I AM A CONSTRUCTOR");/// Constructor Declared
	}

	int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
}

class Derived12 extends Base12 {
	int y; // Child Class

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}

public class ConstructorInInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Derived12 G2 = new Derived12(); /// derived class inherits constructor Statement
	}

}
