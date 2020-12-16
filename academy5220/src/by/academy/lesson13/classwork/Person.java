package by.academy.lesson13.classwork;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private int age;
	private String gender;
	private transient String password;
	public static String stasik = "stasik";

	public Person() {
	}

	public Person(String name, int age, String gender, String password) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.password = password;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append(", gender=");
		builder.append(gender);
		builder.append(", password=");
		builder.append(password);
		builder.append(", stasik=");
		builder.append(stasik);
		builder.append("]");
		return builder.toString();
	}

}
