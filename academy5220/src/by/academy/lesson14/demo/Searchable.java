package by.academy.lesson14.demo;

@FunctionalInterface
public interface Searchable {

	boolean test(Car car);

	@Override
	int hashCode();

	@Override
	boolean equals(Object obj);

	@Override
	String toString();

}