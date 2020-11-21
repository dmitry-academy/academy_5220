package by.academy.lesson7.oop.deal.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarusianPhoneValidator implements Validator {

	private Pattern p = Pattern.compile("\\+375((29)|(33)|(25))[0-9]{7}");

	@Override
	public boolean isValid(String s) {
		Matcher m = p.matcher(s);
		return m.find();
	}

	public static void main(String... args) {
		BelarusianPhoneValidator v = new BelarusianPhoneValidator();
		System.out.println("+375291000000: " + v.isValid("+375291000000"));
		System.out.println("+175291000000: " + v.isValid("+175291000000"));
		System.out.println("+375291234567: " + v.isValid("+375291234567"));
	}
}
