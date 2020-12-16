package by.academy.lesson15.methods;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import by.academy.lesson15.Car;

public class ReflectionInvokePrivateDemo {
	public static void main(String... args) {

		Car car = new Car(100, "AA180A1");
		Class<? extends Car> carClass = car.getClass();

		try {
			Method startEngineMethod = carClass.getDeclaredMethod("printObject");
//			startEngineMethod.setAccessible(true);
			startEngineMethod.invoke(car); // output: Wroooommmm

		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
