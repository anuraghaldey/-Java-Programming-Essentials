package Ch_4_ConditionalsInJava;

public class IfElseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * if (condition1) {
		 * 
		 * //Statements;
		 * 
		 * else if {
		 * 
		 * // Statements;
		 * 
		 * }
		 * 
		 * else {
		 * 
		 * //Statements
		 * 
		 * }
		 */
		int a = 11;
		if (a > 1) {
			System.out.println("NICE");
		} else if (a < 1) {
			System.out.println("VERY NICE");
		} else if (a == 0) {
			System.out.println("VERY VERY NICE");
		}
	}
}