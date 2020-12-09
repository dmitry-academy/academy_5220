package by.academy.lesson13.classwork;

import java.io.IOException;

public class TryWithResoursesCustomDemo {

	public static void main(String[] args) throws IOException {

		try (Autocloseable a = new Autocloseable()) {
			a.eat();
			a.walk();
		}
	}

}
