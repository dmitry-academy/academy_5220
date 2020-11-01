package by.academy.lesson4.loop;

public class DoWhile {
	public static void main(String[] args) {
		int n = 10;
		do {
			System.out.println("Тик " + n--);
		} while (n > 0);

		int sum = 0;
		int i = 0;
		while (i < 20) {
			if (i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.print("sum = " + sum);

	}
}