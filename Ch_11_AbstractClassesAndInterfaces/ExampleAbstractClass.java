package Ch_11_AbstractClassesAndInterfaces;

abstract class Shape {
	public void radius() {
		System.out.println("CIRCLE HAS SHAPE");
	}

	abstract public void S();
}

class circle extends Shape {
	@Override
	public void S() {
		System.out.println("CIRCLE HAS CIRCULAR SHAPE");
	}
}

class rectangle extends Shape {
	@Override
	public void S() {
		System.out.println("RECTANGLE HAS RECTANGULAR SHAPE ");
	}
}

class square extends Shape {
	@Override
	public void S() {
		System.out.println("SQUARE HAS SQUARE SHAPE ");
	}
}

public class ExampleAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle C = new circle();
		square S1 = new square();
		rectangle R = new rectangle();

		C.S();
		S1.S();
		R.S();

	}

}
