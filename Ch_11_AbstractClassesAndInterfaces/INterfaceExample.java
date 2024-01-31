package Ch_11_AbstractClassesAndInterfaces;

import java.util.Scanner;

interface Bicycle {
	void applyBrake(int decrement);

	void accelerate(int increment);
//INTERFACE
}

abstract class Cycle {
	Cycle() {
		System.out.println("CYCLE");//ABSTRACT CLASS
	}

	abstract public void C();
}

class A1 extends Cycle implements Bicycle {
	int speed = 40;//CONCRETE CLASS EXTENDS ABSTRACT CLASS AND IMPLEMENTS
	//INREFACE

	@Override
	public void applyBrake(int decrement) {
		speed = speed - decrement;

	}

	public void accelerate(int increment) {
		speed = speed + increment;
	}

	public void C() {
		System.out.println("I AM A CYCLE");
	}
}


public class INterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 A = new A1();
		

	}

}
