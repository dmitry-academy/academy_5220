package by.academy.lesson15;

import java.lang.reflect.Field;

public class ReflectionChangingValuesDemo {
	public static void main(String... args) {

		Car car = new Car(500, "1233");
		Class<? extends Car> carClass = car.getClass();

		try {
//			Field horsePowerField = carClass.getDeclaredField("horsepower");
//			horsePowerField.setAccessible(true);
//			System.out.println("Horseposer field value:" + horsePowerField.getInt(car));

			Field serialNumberField = carClass.getDeclaredField("serialNumber");

			System.out.println("Before change:" + serialNumberField.get(car));
			serialNumberField.setAccessible(true);
			serialNumberField.set(car, "37U1");
			System.out.println("After change:" + serialNumberField.get(car));
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
