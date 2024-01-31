package Ch_10_JavaInheritance;

class Animal {
	String a;

	public String getA() {
		System.out.println("ANIMAL IS DANGEROUS");
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}
}

class Dog extends Animal {
	String d;

	public String getD() {
		System.out.println("DOG IS CUTE");
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}
}

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog c = new Dog();
		c.setA("EVERY DOG IS ANIMAL!!");
		System.out.println(c.getA());

		System.out.println(" ");
		c.setD("VERY CUTE!!");
		System.out.println(c.getD());
	}

}
