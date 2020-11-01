package by.academy.lesson3;

public class SwitchDemo {
	public static void main(String... args) {

		int i = 2;

		switch (i) {
		case 1:
			System.out.println("число равно 1");
		case 2:
			System.out.println("число равно 2");
		case 3:
			System.out.println("число равно 3");
			break;
		case 4:
			System.out.println("число равно 4");
		default:
			System.out.println("default");
			break;
		}
	}
}
