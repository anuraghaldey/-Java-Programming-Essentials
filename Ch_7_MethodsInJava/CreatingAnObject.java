package Ch_7_MethodsInJava;

public class CreatingAnObject {
	int S(int a, int b) {
		int c;
		if (a > b) {
			c = a - b;
		} else {
			c = a + b;
		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreatingAnObject a1 = new CreatingAnObject();
		int e = 20;
		int y = 12;

		System.out.println(a1.S(e, y));
	}

}
