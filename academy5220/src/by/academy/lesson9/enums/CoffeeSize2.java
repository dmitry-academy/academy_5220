package by.academy.lesson9.enums;

public enum CoffeeSize2 {
	// 100, 150 и 200 передаются в конструктор
	BIG(100, "B"), HUGE(150, "H"), OVERWHELMING(200, "O");

	private int ml;
	private String s;

	CoffeeSize2(int ml, String s) {
		this.ml = ml;
		this.s = s;
	}

	public int getMl() {
		return ml;
	}

	public String getS() {
		return s;
	}

}