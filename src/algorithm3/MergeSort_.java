package algorithm3;

import java.util.Arrays;

public class MergeSort_ implements Sort {
	private int work[];
	
	static int n = 1;
	
	public void sort(int array[]) {
		work = new int[array.length / 2 + 1];
		System.out.println("array.length / 2 + 1=" + (array.length / 2 + 1) + ", work.length=" + work.length);
		array[0] = 19;
		array[1] = 14;
		array[2] = 2;
		array[3] = 34;
		array[4] = 24;
		array[5] = 8;
		array[6] = 87;
		array[7] = 84;
		
//		array[0] = 14;
//		array[1] = 2;
//		array[2] = 34;
//		array[3] = 24;
//		array[4] = 8;
//		array[5] = 84;
		mergesort(array, 0, array.length - 1);
	}

	public static void main(String args[]) {
		new SortTester(8, new MergeSort_(), true);
	}

	void mergesort(int array[], int left, int right) {
		Debug debug = new Debug();
		debug.num = n++;
		int num = debug.num;
		System.out.println("☆" + num + " " + "mergesort start ===========================================================");

		System.out.println("☆" + num + " " + "前 array" + num +"：" + Arrays.toString(array));
		System.out.println("☆" + num + " " + "前 work" + num +"：" + Arrays.toString(work));
		System.out.print("☆" + num + " " + "left=" + left + ", right=" + right + ", ");
		if (left >= right) {
			System.out.println("☆" + num + " " + "left >= right return  left=" + left + ", right=" + right);
			System.out.println("☆" + num + " " + "mergesort end" + num + " ===========================================================");
			System.out.println();
			return;
		}
		int mid = (left + right) / 2;
		System.out.println("mid=" + mid);
		int i;
		int p = 0, j = 0, k = left;
		System.out.println();
		System.out.println("☆" + num + " " + "再帰1 ");
		mergesort(array, left, mid);
		System.out.println("☆" + num + " " + "１ array：" + Arrays.toString(array));
		System.out.println("☆" + num + " " + "１ work：" + Arrays.toString(work));
		System.out.println();
		System.out.println("☆" + num + " " + "再帰2 ");
		mergesort(array, mid + 1, right);
		System.out.println("☆" + num + " " + "２ array：" + Arrays.toString(array));
		System.out.println("☆" + num + " " + "２ work：" + Arrays.toString(work));
		System.out.println("☆" + num + " " + "ソート後 left=" + left + ", mid=" + mid);
		for (i = left; i <= mid; i++) {
			System.out.println("☆" + num + " " + "for文 前：" + Arrays.toString(array));
			System.out.println("☆" + num + " " + "p=" + p + ", work[p++]=" + work[p] + ", i=" + i + ", array[i]=" + array[i]);
			work[p++] = array[i];
			System.out.println("☆" + num + " " + "for文 後：" + Arrays.toString(array));
		}
		System.out.println("☆" + num + " " + "for後 array：" + Arrays.toString(array));
		System.out.println("☆" + num + " " + "for後：" + Arrays.toString(work));
		System.out.println("☆" + num + " " + "for後： i=" + i + ", right=" + right + ", j=" + j + ", p=" + p);
		while (i <= right && j < p) {
			System.out.println("☆" + num + " " + "i=" + i + ", j=" + j + ", k=" + k);
			System.out.println("☆" + num + " " + "while1： work[j]=" + work[j] + ", array[i]=" + array[i]);
			System.out.println("☆" + num + " " + "while1文 前 array：" + Arrays.toString(array));
			System.out.println("☆" + num + " " + "while1文 前 work ：" + Arrays.toString(work));
			array[k++] = (work[j] <= array[i]) ? work[j++] : array[i++];
			System.out.println("☆" + num + " " + "array[k++]=" + array[k] + ", i=" + i + ", j=" + j);
			System.out.println("☆" + num + " " + "while1文 後 array：" + Arrays.toString(array));
			System.out.println("☆" + num + " " + "while1文 後 work ：" + Arrays.toString(work));
		}
		System.out.println("☆" + num + " " + "while1後： j=" + j + ", p=" + p);
		while (j < p) {
			System.out.println("☆" + num + " " + "work[j++]=" + work[j]);
			System.out.println("☆" + num + " " + "while2文 前：" + Arrays.toString(array));
			array[k++] = work[j++];
			System.out.println("☆" + num + " " + "while2文 後：" + Arrays.toString(array));
			System.out.println("☆" + num + " " + "array[k++]=" + array[k-1] + " ,k=" + k + ", j=" + j);
		}
		System.out.println("☆" + num + " " + "後 array" + num + "：" + Arrays.toString(array));
		System.out.println("☆" + num + " " + "後 work" + num + "：" + Arrays.toString(work));
		System.out.println("☆" + num + " " + "mergesort end ===========================================================");
		System.out.println();
	}
}
