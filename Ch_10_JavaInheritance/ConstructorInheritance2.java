package Ch_10_JavaInheritance;

class GrandParent {
	GrandParent() {
		System.out.println("I AM GRANDPARENT!!");
	}
}

class Parent1 extends GrandParent {
	Parent1() {
		System.out.println("I AM PARENT!!");
	}
}

class GrandChild extends Parent1 {
	GrandChild() {
		System.out.println("I AM CHILD");
	}
}

public class ConstructorInheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandChild G1 = new GrandChild();
	}

}
