package Ch_10_JavaInheritance;

class Mother1 {
	Mother1() {
		System.out.println("I AM A CONSTRUCTOR!!");
	}

	Mother1(int a) {
		System.out.println("I AM AN OVERLOADED CONSTRUCTOR OF VALUE : " + a);
	}
}

class Daughter1 extends Mother1 {
	Daughter1() {

		System.out.println("I AM AN ANOTHER CONSTRUCTOR!");
	}

	Daughter1(int a, int b9) {
		super(a);
		System.out.println("I AM HAVING VALUE: " + b9);
	}
}

class Son1 extends Daughter1 {
	Son1() {
		System.out.println("I AM AN OTHER CONSTRUCTOR!");
	}

	Son1(int a, int b, int c) {
		super(a, b);
		System.out.println("I AM HAVING EXTREME VALUE :" + c);
	}
}

public class ConstrutorOverloadingInheritance1 {
	public static void main(String[] args) {

		Son1 D1 = new Son1(12, 23, 234);

	}// HERE OVERLOADED CONSTRUCTOR WILL BE PRINTED AS WE USED KEYWORD SUPER AND GAVE
		// VALUE!!
}