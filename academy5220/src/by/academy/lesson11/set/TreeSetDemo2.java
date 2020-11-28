package by.academy.lesson11.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {
		SortedSet<String> treeSet = new TreeSet<>();

		treeSet.add("Минск");
		treeSet.add("Брест");
		treeSet.add("Могилев");
		treeSet.add("Гродно");
		treeSet.add("Гомель");
		treeSet.add("Минск");

		System.out.println(treeSet);

		SortedSet<String> subSet = treeSet.subSet("Минск", "Брест");
		System.out.println("SubSet: " + subSet);

		System.out.println("HeadSet: " + treeSet.headSet("Минск"));
		System.out.println("TailSet: " + treeSet.tailSet("Минск"));
		System.out.println("Первый элемент: " + treeSet.first());
		System.out.println("Последний элемент: " + treeSet.last());
	}
}