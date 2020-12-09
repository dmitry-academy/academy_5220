package by.academy.lesson13.classwork;

import java.io.Closeable;
import java.io.IOException;

public class Autocloseable implements Closeable {

	@Override
	public void close() throws IOException {
		System.out.println("CLOSE!");
	}

	public void eat() {
		System.out.println("eat!");
	}

	public void walk() {
		System.out.println("walk!");
	}
}
