package by.academy.lesson10.innerclasses.classwork;

public class InnerDemo {

	public static void main(String... args) {

		Walkable w = new Walkable() {
			@Override
			public void walk() {
				System.out.println("Я гуляю!");
			}

			@Override
			public void stop() {
				System.out.println("Я не гуляю!");
			}
		};
		w.walk();
	}

}
