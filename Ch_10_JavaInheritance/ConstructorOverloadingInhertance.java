package Ch_10_JavaInheritance;

class Father {// Parent Class
	Father() {
		System.out.println("I AM AN CONSTRUCTOR!!"); // COnstructor
	}

	Father(int a) {
		System.out.println("I AM AN OVERLOADED CONSTRUCTOR WITH VALUE :" + a);/// OVERLOADED CONSTRUCTOR
	}
}

class Son extends Father {// CHILD CLASS
	Son() {
		System.out.println("I AM ANOTHER CONSTRUCTOR"); // CONSTRUCTOR
	}
}

public class ConstructorOverloadingInhertance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son S1 = new Son();// HERE IT WILL NOT PRINT OVERLOADED CONSTRUCTOR AS SUPER KEYWORD IS NOT USED
	}

}
