package Ch_10_JavaInheritance;

class Parent12 {
	public void A() {
		System.out.println("I AM 1ST METHHOD OF PARENT CLASS ");
	}

	public void B() {
		System.out.println("I AM 2ND METHOD OF PARENT CLASS ");
	}
}

class Child1 extends Parent12 {
	@Override // indicator that a method is being overridden
	public void A() {
		System.out.println("I AM 1ST METHOD OF CHILD CLASS ");
	}

	public void B() {
		System.out.println("I AM 2ND METHOD OF CHILD CLASS");
	}
}

public class MethodOveriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 C1 = new Child1();
		C1.A();
		C1.B();

		// Difference between overriding and overloading is that
		// overloading takes parameters and overriding doesent
	}

}
