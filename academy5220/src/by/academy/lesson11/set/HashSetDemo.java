package by.academy.lesson11.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();

		hashSet.add("Минск");
		hashSet.add("Брест");
		hashSet.add("Могилев");
		hashSet.add("Гродно");

		System.out.println(hashSet.add("Гомель"));
		System.out.println(hashSet.add("Минск"));

		System.out.println(hashSet);
	}
}