package by.academy.lesson7.oop.deal.main;

import by.academy.lesson7.oop.deal.Meat;
import by.academy.lesson7.oop.deal.Milk;
import by.academy.lesson7.oop.deal.Person;
import by.academy.lesson7.oop.deal.Product;
import by.academy.lesson7.oop.deal.Vine;

public class Application {

	public static void main(String[] args) {
		Person seller = new Person("Vasya", 200.00);
		Person buyer = new Person("Petya", 300.00);

		Product[] products = new Product[4];

		products[0] = new Meat(15.00, "meat", "Academy Bel", 7);
		products[1] = new Vine(7.00, "vine", "peach", 7);
		products[2] = new Milk(3.00, "milk", "banana", 15, "black");
		products[3] = new Milk(3.00, "milk", "banana", 15, "black");

//		for (Product p : products) {
//			System.out.println("Name: " + p.getProducerName());
//			System.out.println("Type: " + p.getType());
//			System.out.println("Total Price: " + p.calcTotalPrice());
//			System.out.println("-----------------");
//		}
		Person.americanPhoneValidator.isValid("+123123123");

		System.out.println(((Milk) products[2]).getNonStaticMilkCount());
		System.out.println(Milk.getMilkCount());

//		Product pTest = new Milk(3.00, "fruits", "banana", 15, "black");
//		Milk mtest = new Product(10.00, "fruits", "apple", 5);
//		Deal firstDeal = new Deal("1 January",buyer,seller,products);
//		firstDeal.result();

	}

}
