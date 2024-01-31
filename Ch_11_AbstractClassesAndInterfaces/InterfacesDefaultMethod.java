
package Ch_11_AbstractClassesAndInterfaces;

interface Animal {
	// Default method
	default void say() {
		System.out.println("Hello, this is default method");
	}

	// Abstract method
	void bark();
}

public class InterfacesDefaultMethod implements Animal {

	@Override
	public void bark() {
		System.out.println("Dog barks!");
	}

	public static void main(String[] args) {
		InterfacesDefaultMethod obj1 = new InterfacesDefaultMethod();
		obj1.bark();
		obj1.say();

	}

}