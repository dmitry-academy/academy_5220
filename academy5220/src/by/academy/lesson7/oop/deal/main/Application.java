package by.academy.lesson7.oop.deal.main;

import by.academy.lesson7.oop.deal.Deal;
import by.academy.lesson7.oop.deal.Meat;
import by.academy.lesson7.oop.deal.Milk;
import by.academy.lesson7.oop.deal.Person;
import by.academy.lesson7.oop.deal.Product;
import by.academy.lesson7.oop.deal.Vine;

public class Application {

	public static void main(String[] args) {
		Person seller = new Person("Vasya", 200.00);
		Person buyer = new Person("Petya", 300.00);

		Deal deal = new Deal("21-11-2020", seller, buyer);

		deal.addProduct(new Meat(15.00, "1", "Academy Bel", 7));
		deal.addProduct(new Vine(7.00, "2", "peach", 7));
		deal.addProduct(new Milk(3.00, "3", "banana", 15, "black"));
//		products[3] = new Milk(3.00, "milk", "banana", 15, "black");

		deal.printProducts();
		deal.deleteProduct(2);
		System.out.println("---------------------------------------");
		deal.printProducts();

//		Person.americanPhoneValidator.isValid("+123123123");

//		System.out.println(((Milk) products[2]).getNonStaticMilkCount());
//		System.out.println(Milk.getMilkCount());

//		Product pTest = new Milk(3.00, "fruits", "banana", 15, "black");
//		Milk mtest = new Product(10.00, "fruits", "apple", 5);
//		Deal firstDeal = new Deal("1 January",buyer,seller,products);
//		firstDeal.result();

	}

}
