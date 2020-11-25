package by.academy.lesson10.innerclasses;

public class Food {
	public static void main(String[] args) {
		Potato potato = new Potato() {
			@Override
			public void peel() {
				System.out.println("Чистим картошку в анонимном классе.");
			}
		};
		potato.peel();
	}
}