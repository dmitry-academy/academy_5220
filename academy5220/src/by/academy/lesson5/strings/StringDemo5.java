package by.academy.lesson5.strings;

public class StringDemo5 {
	public static void main(String[] args) {

		System.out.println("Foobar".endsWith("bar"));
		System.out.println("Foobar".endsWith("cat"));
		System.out.println("Foobar".startsWith("Foo"));
		System.out.println("Foobar".startsWith("cat"));
		System.out.println("Foobar".contains("oo"));
		System.out.println("Foobar".contains("cat"));

		System.out.println("Hello oworld!!!".regionMatches(7, "oworld", 0, 4));
	}
}