package by.academy.lesson14;

@FunctionalInterface
public interface Eatable {

	void doSomething(Car car);

	default void doSomething1(Car car) {

	};

}
