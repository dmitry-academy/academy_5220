package by.academy.lesson4;

import java.util.Arrays;

public class BubleSort {

	public static void main(String[] args) {

		int[] arr = { 3, 7, 2, 1, 9 };
		int temp = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));

	}

}
