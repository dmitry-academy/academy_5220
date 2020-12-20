package by.academy.lesson17.threads;

public class ThreadExtendsDemo {

	public static void main(String[] args) {
		ExtendedThread thread = new ExtendedThread();
		thread.start();

		System.out.println("Main thread finished...");
	}
}
