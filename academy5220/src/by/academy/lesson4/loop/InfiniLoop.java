package by.academy.lesson4.loop;

public class InfiniLoop {

	public static void main(String[] args) {
		String str = "";
		for (;;) {
			System.out.println("Смерть процессорам!");
			str += "Java убивает";
			System.out.println(str);
		}
	}

}
