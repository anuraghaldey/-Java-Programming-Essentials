package Ch_10_JavaInheritance;

class Grandmother {
	Grandmother() {
		System.out.println("I am a Constructor!!");
	}

	Grandmother(int a) {
		System.out.println("I AM A CONSTRUCTOR WITH VALUE : " + a);
	}
}

class MOTHER {
	MOTHER() {

		System.out.println("I AM CONSTRUCTOR OF MOTHER CLASS ");
	}

	MOTHER(int a, int b) {

		System.out.println("I AM HAVING VALUE:" + b);
	}
}

public class ConstructorOverloadingInheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
