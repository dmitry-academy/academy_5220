package by.academy.lesson7.oop.deal;

public class Application {

	public static void main(String[] args) {
		Person seller = new Person("Vasya", 200.00);
		Person buyer = new Person("Petya", 300.00);

		Product[] products = new Product[4];
		products[0] = new Product(10.00, "fruits", "apple", 5);
		products[1] = new Product(7.00, "fruits", "peach", 7);
		products[2] = new Product(3.00, "fruits", "banana", 15);
		products[3] = new Milk(3.00, "fruits", "banana", 15, "black");
		
		Product pTest = new Milk(3.00, "fruits", "banana", 15, "black");
//		Milk mtest = new Product(10.00, "fruits", "apple", 5);
//		Deal firstDeal = new Deal("1 January",buyer,seller,products);
//		firstDeal.result();
		
		
	} 

	
}

