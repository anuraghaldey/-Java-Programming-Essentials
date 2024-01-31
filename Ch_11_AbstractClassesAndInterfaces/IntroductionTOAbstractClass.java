package Ch_11_AbstractClassesAndInterfaces;

abstract class Parent {
	Parent() {
		System.out.println("I am Parent! ");
	}

// AN ABSTRACT CLASS IS AN CLASS WHICH DOESNT HAS EXISTANCE AND
	// WHICH CANT BE IMPLEMENTED
	Parent(int a) {// CONSTRUCTOR OVERLOADING
		System.out.println("I AM A PARENT OF AGE: " + a);
	}

	abstract public void sayHello();// HERE ABSTRACT CLASS IS DEFINED
	// BY DEFINING AN ABSTRACT METHOD,IF A SINGLE METHOD IN A CLASS IS ABSTRACT
	// THE WHOLE CLASS BECOMES ABSTRACT;
}

class ward extends Parent {// THIS IS A CONCRETE CLASS WHICH HAS AN EXISTANCE AND
	// IMPLEMENTATION
	@Override
	public void sayHello() {// ABSRACT FUNCTION IS OVERRIDDEN IN THIS CLASS
		System.out.println("HELLLO MY FRIEND");
	}
}

abstract class ward1 extends Parent {
	public void Dontsayhello() {
		System.out.println("DONT SAY HELLO");
	}// WE CANT INHERIT CONCRETE CLASS WITHOUT OVERRIDING
		// OR ELSE DECLARE IT AS AN ABSTRACT CLASS IN ORDER TO INHERIT
}

public class IntroductionTOAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ward W = new ward();
		W.sayHello();// WE CAN MAKE AN OBJECT OF CONCRETE EXISTING CLASS

		// ward1 W1 = new ward1();// THIS WILL SHOW ERROR
		// Parent P1 = new Parent(); THIS WILL SHOW ERROE
	}

}
