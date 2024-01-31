package Ch_11_AbstractClassesAndInterfaces;

interface car {
	public void speed();

	public void suspension();

}

interface bus {
	public void sp();

	public void sus();
}

interface train {
	public void s();

	public void su();
}

interface rickshaw {
	public void SP();

	public void SU();
}

class Transport implements car, bus, train, rickshaw {
	public void speed() {
		System.out.println("Normal");
	}

	public void suspension() {
		System.out.println("NORMAL");
	}

	public void sp() {
		System.out.println("LOW");
	}

	public void sus() {
		System.out.println("low");
	}

	public void s() {
		System.out.println("HIGH");
	}

	public void su() {
		System.out.println("high");
	}

	public void SP() {
		System.out.println("VERY LOW");
	}

	public void SU() {
		System.out.println("VERY low");
	}

}// CREATING ONE MAJOR CLASS USING TOO MANY INTERFACES

public class InterfaceExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transport T = new Transport();
		T.speed();
		T.suspension();
		T.sus();
		T.sp();
		T.su();
		T.s();
		T.SP();
		T.su();

	}

}
