package algorithm3;

import java.util.Arrays;

public class QuickSort_ implements Sort {
	
	static int n = 1;
	
	public static void main(String args[]) {
		new SortTester(7, new QuickSort_(), true);
	}

	public void sort(int array[]) {
//		array[0]=23;
//		array[1]=17;
//		array[2]=21;
//		array[3]=32;
//		array[4]=58;
//		array[5]=52;
//		array[6]=57;
		array[0]=23;
		array[1]=17;
		array[2]=58;
		array[3]=52;
		array[4]=32;
		array[5]=21;
		array[6]=57;
		qsort(array, 0, array.length - 1);
	}

	void qsort(int array[], int left, int right) {
		Debug debug = new Debug();
		debug.num = n++;
		int num = debug.num;
		System.out.println("qsort start" + num + " ===========================================================");
		System.out.println("array[]=" + Arrays.toString(array) + ", left=" + left + ", right=" + right + ", (left + right) / 2=" + ((left + right) / 2));
		if (left < right) {
			int pivot = array[(left + right) / 2];
			int i = left;
			int j = right;
			do {
				System.out.println("do-while start ------------------------------------------------");
				System.out.println("i=" + i + ", j=" + j + ", pivotIndex=" + ((left + right) / 2) + ", pivot=" + pivot + ", array[i]=" + array[i] + ", array[j]=" + array[j]);
				while (array[i] < pivot) {
					System.out.print("while i：i=" + i + ", array[i]=" + array[i] + ", pivot=" + pivot);
					i++;
					System.out.println(" →i++=" + i);
				}
				while (array[j] > pivot) {
					System.out.print("while j：j=" + j + ", array[j]=" + array[j] + ", pivot=" + pivot);
					j--;
					System.out.println(" →j--=" + j);
				}
				System.out.println("i=" + i + ", j=" + j);
				if (i <= j) {
					System.out.println("前：i=" + i + ", j=" + j + ", array[i]=" + array[i] + ", array[j]=" + array[j]);
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
					System.out.println("後：i=" + i + ", j=" + j + ", array[i]=" + array[i] + ", array[j]=" + array[j]);
					i++;
					j--;
					System.out.println("if文：i=" + i + ", j=" + j);
				}
				System.out.println("do-while途中 array[]=" + Arrays.toString(array));
			} while (i <= j);
			System.out.println("do-while end ------------------------------------------------");
			System.out.println("\nqsort left ：array[]=" + Arrays.toString(array) + ", left=" + left + ", j=" + j);
			qsort(array, left, j);
			System.out.println("\nqsort right：array[]=" + Arrays.toString(array) + ", i=" + i + ", right=" + right);
			qsort(array, i, right);
			System.out.println("qsort end" + num + " ===========================================================");
			System.out.println();
		}
	}
}
