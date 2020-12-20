package by.academy.lesson17;

public class MyThread extends Thread {

	public void run() {
		System.out.println("Важная работа выполняется в потоке " + getName());
	}

	public void run(String s) {
		System.out.println("String in run is " + s);
	}
}