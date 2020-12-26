package by.academy.test;

public class ApplicationMyIteratorTwo {

	public static void main(String[] args) {

		Integer[][] arr = { { 1 }, { 1, 2 }, { 1, 2, 3 } };

		MyIteratorTwo<Integer> iteratorTwo = new MyIteratorTwo<Integer>(arr);

		while (iteratorTwo.hasNext()) {
			System.out.print(iteratorTwo.next() + " ");
		}

	}

}