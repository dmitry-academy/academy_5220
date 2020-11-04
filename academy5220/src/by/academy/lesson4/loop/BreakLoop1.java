package by.academy.lesson4.loop;

public class BreakLoop1 {
	public static void main(String[] args) {
		int i = 1, n = 100;

		int result = 0;
		while (i < n) {
			if (i != 73 && i % 2 == 0 && i % 13 == 0) {
				result = i;
				break;
			}
			System.out.println("i: " + i++);
		}
		System.out.println("Цикл завершен. result: " + result);
	}
}