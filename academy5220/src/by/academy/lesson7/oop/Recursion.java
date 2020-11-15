package by.academy.lesson7.oop;

public class Recursion {
	static long factorial(int n) {
		long result;

		if (n < 2) {
			return 1;
		}
		result = factorial(n - 1) * n;
		return result;
	}

	public static void main(String[] args) {
//		System.out.println("Факториал 3: " + factorial(3));
//		System.out.println("Факториал 4: " + factorial(4));
		System.out.println("Факториал 5: " + factorial(5));
	}
}