package by.academy.lesson8.abstracts;

public abstract class Figure2 {
	double dim1;
	double dim2;

	public Figure2(double dim1, double dim2) {
		this.dim1 = dim1;
		this.dim2 = dim2;
	}

	public abstract double area();
}