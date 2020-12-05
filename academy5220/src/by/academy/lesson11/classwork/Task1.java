package by.academy.lesson11.classwork;

import java.util.ArrayList;
import java.util.List;

import by.academy.lesson7.oop.HeavyBox;

public class Task1 {
	public static void main(String... args) {
		List<HeavyBox> list = new ArrayList<>();

		HeavyBox hbox1 = new HeavyBox(1, 2, 3, 4);
		HeavyBox hbox2 = new HeavyBox(2, 3, 4, 4);
		HeavyBox hbox3 = new HeavyBox(3, 4, 5, 4);
		HeavyBox hbox4 = new HeavyBox(4, 5, 6, 4);

		list.add(hbox1);
		list.add(hbox2);
		list.add(hbox3);
		list.add(hbox4);

		for (HeavyBox b : list) {
			System.out.println(b);
		}
	}
}
