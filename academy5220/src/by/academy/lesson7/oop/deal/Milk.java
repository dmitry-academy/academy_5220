package by.academy.lesson7.oop.deal;

public class Milk extends Product {

	 String color;

	public Milk(double price, String type, String name, int quantity, String color) {
		super(price, type, name, quantity);
		this.color = color;
	}

	protected double calcDiscount() {
		if (name.contains("a")) {
			return 0.9;
		}
		return 1;
	}
}
