package Ch_9_AccessModifiers_Constructors;

//GETTERS AND SETTERS METHOD
class MyNewEmployee {
	private int id;
	private String name;

	public String GETNAME() {
		return name;
	}

	public void SETNAME(String a) {
		name = a;
	}

	public int GETID() {
		return id;
	}

	public void SETID(int b) {
		id = b;
	}
}

public class AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNewEmployee Anurag = new MyNewEmployee();// creating an object
		/*
		 * Anurag.id = 12;// WILL SHOW AN ERROR DUE TO ACCES MODIFIERS Anurag.name =
		 * "ANURAG!";// Will show an error due to acces modifiers
		 */
		Anurag.SETNAME("MY NAME IS ANURAG!!!");// getting id
		System.out.println(Anurag.GETNAME());// setting id

		Anurag.SETID(34);// setting id
		System.out.println(Anurag.GETID());// getting id
	}

}
