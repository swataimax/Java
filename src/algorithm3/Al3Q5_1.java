package algorithm3;

import java.util.Random;

public class Al3Q5_1 {
	public static void main(String args[]) {
//		for (int n = 100000; n <= 10000000; n *= 10) {
		for (int n = 10; n <= 10000; n *= 10) {
			System.out.printf("--- データ数 %,d ---%n", n);
			new Al3Q5_1(n);
		}
	}

	Al3Q5_1(int max) {
		int array1[] = new int[max], array2[] = new int[max], array3[] = new int[max];
		Random rnd = new Random();
		for (int i = 0; i < max; i++) {
			array1[i] = array2[i] = array3[i] = rnd.nextInt(max);
			long t0 = System.nanoTime();
			quicksort(array1);
			long t1 = System.nanoTime();
			heapsort(array2);
			long t2 = System.nanoTime();
			mergesort(array3);
			long t3 = System.nanoTime();
//			System.out.printf("Quick:%,16d ns%n", (t1 - t0));
//			System.out.printf("Heap :%,16d ns%n", (t2 - t1));
//			System.out.printf("Merge:%,16d ns%n", (t3 - t2));
		}
	}

	public void quicksort(int array[]) {
		qsort(array, 0, array.length - 1);
	}

	void qsort(int array[], int left, int right) {
		if (left < right) {
			int pivot = array[(left + right) / 2], i = left, j = right;
			do {
				while (array[i] < pivot) {
					i++;
				}
				while (array[j] > pivot) {
					j--;
				}
				if (i <= j) {
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
					i++;
					j--;
				}
			} while (i <= j);
			qsort(array, left, j);
			qsort(array, i, right);
		}
	}

	public void heapsort(int array[]) {
		for (int i = (array.length - 1) / 2; i >= 0; i--) {
			downheap(array, i, array.length - 1);
		}
		for (int i = array.length - 1; i > 0; i--) {
			int tmp = array[0];
			array[0] = array[i];
			array[i] = tmp;
			downheap(array, 0, i - 1);
		}
	}

	void downheap(int a[], int left, int right) {
		int root = a[left], c, p; //親
		for (p = left; p < (right + 1) / 2; p = c) {
			int cl = p * 2 + 1, cr = cl + 1;
			c = (cr <= right && a[cr] > a[cl]) ? cr : cl;
			if (root >= a[c]) {
				break;
			}
			a[p] = a[c];
		}
		a[p] = root;
	}

	private int work[];

	void merge(int array[], int left, int right) {
		if (left >= right) {
			return;
		}
		int mid = (left + right) / 2, i, p = 0, j = 0, k = left;
		merge(array, left, mid);
		merge(array, mid + 1, right);
		for (i = left; i <= mid; i++) {
			work[p++] = array[i];
		}
		while (i <= right && j < p) {
			array[k++] = (work[j] <= array[i]) ? work[j++] : array[i++];
		}
		while (j < p) {
			array[k++] = work[j++];
		}
	}

	public void mergesort(int array[]) {
		work = new int[array.length / 2 + 1];
		merge(array, 0, array.length - 1);
	}
}
