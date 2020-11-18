package by.academy.lesson8.statics;

import java.util.Arrays;

public class StaticVars {
	int a;
	static int b;

	static String[] arr = null;

	static {
		arr = new String[10];
		arr[0] = "test string";
	}

	public static void main(String[] args) {
		StaticVars staticVars = new StaticVars();
		System.out.println(staticVars.a);
		System.out.println(b);

		System.out.println(Arrays.toString(arr));
	}

	public void test() {

	}
}