package Ch_8_IntroductionToOOP;

class Employee {
	int id;
	String name;
}

public class ClassAndObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee Anurag = new Employee();// Object Creation 1
		Anurag.name = "MY NAME IS ANURAG";
		Anurag.id = 23;
		System.out.println(Anurag.name);
		System.out.println(Anurag.id);
		System.out.println(" ");

		Employee HarshWardhan = new Employee();// Object Creation 2
		HarshWardhan.name = "Harsh";
		HarshWardhan.id = 34;
		System.out.println(HarshWardhan.name);
		System.out.println(HarshWardhan.id);
        //Here One class'Employee' has 2 objects as Anurag and HarshWardhan 

	}

}
