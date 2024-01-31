package Ch_10_JavaInheritance;

class Phone {
	public void off() {
		System.out.println("TURNING OFF THE PHONE ");
	}

	public void on() {
		System.out.println("TURNING ON THE PHONE");
	}
}

class smartphone extends Phone {
	public void start() {
		System.out.println("STARTING THE SMARTPHONE");
	}

	@Override
	public void on() {
		System.out.println("TURNING ON THE SMARTPHONE ");
	}
}

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone M1 = new smartphone();// THIS IS CALLED DYNAMIC METHOD DISPATCH
		M1.off();
		M1.on();// HERE INSTEAD OF CALLING FUNCTION FROM OBJECT REFFERED(ie PHONE CLASS
		// IT CALLS FUNCTION FROM OBJECT CREATION CLASS ie SMARTPHONE

	}

}
