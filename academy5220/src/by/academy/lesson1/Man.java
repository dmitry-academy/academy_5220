package by.academy.lesson1;

public class Man {

	public String name;
	public int counter = 0;

	public Man() {
		System.out.println("Man created!");
	}

	public Man(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println("run, " + name + " run");
	}

	public void run(int distance) {
		System.out.println("run, " + name + " run " + distance + "m");
	}

	public void addCounter() {
		counter = counter + 1;
	}
}
