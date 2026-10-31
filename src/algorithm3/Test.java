package algorithm3;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		int size = 10;
		int[] array1 = new int[size];
		int[] array2 = new int[size];
		int[] array3 = new int[size];
		int[] array4 = new int[size];
		int[] array5 = new int[size];
		int[] array6 = new int[size];
		int[] array7 = new int[size];
		
		Random rnd = new Random();
		for (int i = 0; i < size; i++) {
			int r = rnd.nextInt(size * 10);
			array1[i] = r;
			array2[i] = r;
			array3[i] = r;
			array4[i] = r;
			array5[i] = r;
			array6[i] = r;
			array7[i] = r;
		}
		print(array1);
		print(array2);
		print(array3);
		print(array4);
		print(array5);
		print(array6);
		print(array7);
		
		// バブルソート
		BubbleSort2 bs = new BubbleSort2();
		bs.sort(array1);
		print(array1);
		
		// 選択ソート
		SelectionSort ss = new SelectionSort();
		ss.sort(array2);
		print(array2);
		
		// 挿入ソート
		InsertionSort is = new InsertionSort();
		is.sort(array3);
		print(array3);
		
		// シェルソート
		ShellSort shs = new ShellSort();
		shs.sort(array4);
		print(array4);
		
		// クイックソート
		QuickSort qs = new QuickSort();
		qs.sort(array5);
		print(array5);
		
		// ヒープソート
		HeapSort hs = new HeapSort();
		hs.sort(array6);
		print(array6);
		
		// マージソート
		MergeSort ms = new MergeSort();
		ms.sort(array7);
		print(array7);
		
	}
	
	static void print(int[] array) {
		for (int val : array)
			System.out.print(val + "\t");
		System.out.println();
	}

}
