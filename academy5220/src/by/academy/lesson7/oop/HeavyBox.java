package by.academy.lesson7.oop;

public class HeavyBox extends Box {
	int weight;

	public HeavyBox() {
	}

	public HeavyBox(int width, int height, int depth, int weight) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.weight = weight;
	}
}