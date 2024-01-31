package Ch_9_AccessModifiers_Constructors;

class MyyEmployee {
	private int id;
	private String name;

	public MyyEmployee(String n, int s) { // HERE THIS MyEmployee() FUNCTION IS A CONSTRUCTOR
		// INSTEAD OF SETTING VALUE EVERY TIME A CONSTRUCTOR IS USED TO SET A DEFAULT
		id = s; // VALUE THAT CAN BE USED BY EVERY OBJECT IN A CLASS.
		name = n;
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

public class Constructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyyEmployee Anurag = new MyyEmployee("ANURAG", 23);// CONSTRUCTOR USED
		System.out.println("EMPLOYEE 2 ID");
		System.out.println(Anurag.getid()); // HERE NO NEED OF SETTING VALUE
		System.out.println(Anurag.getname());
		System.out.println(" ");
		MyyEmployee Harsh = new MyyEmployee("HARSH", 56);// CONSTRUCTOR USED
		// HERE NO NEED OF SETTING VALUE
		System.out.println("EMPLOYEE 1 ID");
		System.out.println(Harsh.getid());
		System.out.println(Harsh.getname());
	}

}