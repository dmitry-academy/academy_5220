package by.academy.lesson6.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("a*b");

		String text = "aacbsjkhjkhjkd";

		Matcher matcher = pattern.matcher(text);
		boolean b = matcher.matches();
		System.out.println(b);
	}
}