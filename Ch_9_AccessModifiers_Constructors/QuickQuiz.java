package Ch_9_AccessModifiers_Constructors;

class Employees {
	private int id;
	private String name;

	Employees(String n, int i) {
		System.out.println("EMPLOYEE NAME IS: " + n);
		System.out.println("EMPLOYEE ID IS: " + i);
	}

	Employees(int j) {
		System.out.println("EMPLOYEE SALARY IS: " + j+" Rupees");
	}

	public int getid() {
		return id;
	}

	public void setid(int i) {
		id = i;
	}

	public String getname() {
		return name;
	}

	public void setname(String n) {
		name = n;
	}

}

public class QuickQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees Anurag = new Employees("ANURAG", 34);
		Employees Anurag1 = new Employees(34000);
	}

}
