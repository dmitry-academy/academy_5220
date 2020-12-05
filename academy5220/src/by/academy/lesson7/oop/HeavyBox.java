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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HeavyBox [weight=");
		builder.append(weight);
		builder.append(", width=");
		builder.append(width);
		builder.append(", height=");
		builder.append(height);
		builder.append(", depth=");
		builder.append(depth);
		builder.append("]");
		return builder.toString();
	}

}