package by.academy.lesson7.oop;

public class ModificatorsDemo2 {
	public static void main(String[] args) {
		Modificators object = new Modificators();

		// object.defaultVar = 10;// Ошибка компиляции!
		object.publicVar = 20;
		// object.privateVar = 100; // Ошибка компиляции!
	}
}