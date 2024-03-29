package Ch_8_IntroductionToOOP;

class Person {
	int id;
	int salary;
	String name;

	public void printDetails() {
		System.out.println("My id is " + id);
		System.out.println("and my name is " + name);
	}

	public int getSalary() {

		return salary;
	}
}

public class ClassFunctionAndObjects {
	public static void main(String[] args) {
		System.out.println(".....This is our custom class.....");
		Person harry = new Person(); // Instantiating a new Employee Object
		Person john = new Person(); // Instantiating a new Employee Object

		// Setting Attributes for Harry
		harry.id = 12;
		harry.salary = 34000;
		harry.name = "CodeWithHarry";

		// Setting Attributes for John
		john.id = 17;
		john.salary = 32000;
		john.name = "John Khandelwal";

		// Printing the Attributes
		harry.printDetails();
		john.printDetails();

		int salary = john.getSalary();
		System.out.println(salary);
		// System.out.println(harry.id);
		// System.out.println(harry.name);
	}
}