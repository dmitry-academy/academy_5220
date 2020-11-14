package by.academy.lesson7.oop;

public class Overloading1 {

	void test(int a) {
		System.out.println("a: " + a);
	}

	void test(int a, double b) {
		System.out.println("a и b: " + a + " " + b);
		System.out.println("Int + Double");
	}

	void test(double a, int b) {
		System.out.println("a и b: " + a + " " + b);
		System.out.println("Double + Int");
	}

	void test(int a, int b, String s) {
		System.out.println("a и b: " + a + " " + b);
	}

	public static void main(String[] args) {
		Overloading1 ob = new Overloading1();

		ob.test(10);
		ob.test(10.0, 20);
//		ob.test(10, 20, "s");

	}
}