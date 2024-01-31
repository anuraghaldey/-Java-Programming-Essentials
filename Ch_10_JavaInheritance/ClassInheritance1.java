package Ch_10_JavaInheritance;

class Base1 {// PARENT CLASS
	int x;

	public int getX() {
		System.out.println("THE VALUE IS: ");
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

}

class Derived1 extends Base {// DERIVED CLASS USING THE KEYWORD EXTENDS,"CHILD CLASS".
	int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}

class MoreDerived extends Derived1{//GRAND BASE CLASS
	int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
}

public class ClassInheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoreDerived b = new MoreDerived();// HERE OBJECT IS CREATED BY USING MoreDERIVED CLASS BUT IT INHERITS
									// THE PROPERTIES
									// OF BASE CLASS
		
		b.setX(23);
		System.out.println(b.getX());

	}

}
