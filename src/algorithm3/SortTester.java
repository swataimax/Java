package algorithm3;

import java.util.Random;

public class SortTester {
	public SortTester(int size, Sort sort, boolean show) {
		int[] array = new int[size];
		Random rnd = new Random();
		for (int i = 0; i < size; i++) {
			array[i] = rnd.nextInt(size * 10);
		}
		if (show) {
			print(array);
		}
		sort.sort(array);
		if (show) {
			print(array);
		}
	}

//	public void print(int[] array) {
	public static void print(int[] array) {
		for (int val : array)
			System.out.print(val + "\t");
		System.out.println();
	}
}
