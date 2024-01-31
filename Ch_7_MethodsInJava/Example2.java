package Ch_7_MethodsInJava;

public class Example2 {

	static int logic(int x, int y) {
		int z;
		if (x > y) {
			z = x + y;
		} else {
			z = (x + y) * 5;
		}

		return z;
	}

	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		int c;
		// Method invocation using Object creation
		// cwh_31_methods obj = new cwh_31_methods();
		// c = obj.logic(a, b);
		System.out.println(logic(a, b));
		int a1 = 2;
		int b1 = 1;

		System.out.println(logic(a1, b1));
	}
}