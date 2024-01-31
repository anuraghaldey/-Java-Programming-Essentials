package Ch_10_JavaInheritance;

class Parent {// Parent Class
	Parent() { // DEclared Constructor
		System.out.println("MY NAME IS ANURAG");
	}
}

class Child extends Parent { // Child Class
	Child() { // Constructor Declared
		System.out.println("MY AGE IS 19");
	}
}

public class ConstructorInheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child C1 = new Child(); // It inherits constructor properties of Base Class then it prints Constructor
								// properties of child class

	}

}
