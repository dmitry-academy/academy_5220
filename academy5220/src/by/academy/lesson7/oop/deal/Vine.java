package by.academy.lesson7.oop.deal;

import by.academy.lesson7.oop.deal.annotations.Producer;

@Producer(country = "New Zeland", founderFullName = "NewZelander", startYear = 1600)
public class Vine extends Product {

	private static final long serialVersionUID = 1L;

	public Vine(double price, String type, String producerName, int quantity) {
		super(price, type, producerName, quantity);
	}

	@Override
	@Producer(country = "New Zeland", founderFullName = "NewZelander", startYear = 1600)
	public double discount() {
		if (quantity * price > 100) {
			return 0.95;// 5% discount
		}
		return 1;
	}
}
