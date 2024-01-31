package Ch_9_AccessModifiers_Constructors;

class MyEmployee {
	private int id;
	private String name;

	public MyEmployee() { // HERE THIS MyEmployee() FUNCTION IS A CONSTRUCTOR
							// INSTEAD OF SETTING VALUE EVERY TIME A CONSTRUCTOR IS USED TO SET A DEFAULT
		id = 45; // VALUE THAT CAN BE USED BY EVERY OBJECT IN A CLASS.
		name = "ANURAG";
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

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyEmployee Anurag = new MyEmployee();
		System.out.println("EMPLOYEE 2 ID");
		System.out.println(Anurag.getid()); // HERE NO NEED OF SETTING VALUE
		System.out.println(Anurag.getname());
		System.out.println(" ");
		MyEmployee Harsh = new MyEmployee();// HERE NO NEED OF SETTING VALUE
		System.out.println("EMPLOYEE 1 ID");
		System.out.println(Harsh.getid());
		System.out.println(Harsh.getname());
	}

}
