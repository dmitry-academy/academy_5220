package by.academy.lesson17.threads;

public class ExtendedThread extends Thread {
	@Override
	public void run() {
		System.out.println("Hello from separate thread!");
	}
}
