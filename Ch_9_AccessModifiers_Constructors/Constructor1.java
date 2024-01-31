package Ch_9_AccessModifiers_Constructors;

class Office {
	int number;
	String name;
	int marks;

	Office() {
		number = 12;
		name = "anurag";
		marks = 34;
	}
}

public class Constructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Office My = new Office();
		System.out.println(My.number);
		System.out.println(My.name);
		System.out.println(My.marks
				);
	}
}