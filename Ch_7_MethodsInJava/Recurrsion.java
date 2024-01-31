package Ch_7_MethodsInJava;

public class Recurrsion {

	static void fun1(int n) {
		if (n > 0) {
			System.out.println(n);
			fun1(n - 1);
		}
	}

	public static void main(String[] args) {
		int f = 10;
		fun1(f);
		System.out.println("");
		int d = 50;
		fun1(d);
	}
}