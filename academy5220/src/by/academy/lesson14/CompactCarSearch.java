package by.academy.lesson14;

public class CompactCarSearch implements Searchable {
	public boolean test(Car car) {
		return car.getType().equals(CarTypes.COMPACT);
	}
}
