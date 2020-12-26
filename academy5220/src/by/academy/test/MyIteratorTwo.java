package by.academy.test;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyIteratorTwo<T> implements Iterator<T> {

	private T[][] array;
	private int i, j;

	public MyIteratorTwo(T[][] array) {
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		return i < array.length && j < array[i].length;

	}

	@Override
	public T next() {
		T t = array[i][j++];
		if (j >= array[i].length) {
			i++;
			j = 0;
		}
		return t;
	}
}