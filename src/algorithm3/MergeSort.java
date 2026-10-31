package algorithm3;

public class MergeSort implements Sort {
	private int work[];

	public void sort(int array[]) {
		work = new int[array.length / 2 + 1];
		mergesort(array, 0, array.length - 1);
	}

	public static void main(String args[]) {
		new SortTester(10, new MergeSort(), true);
	}

	void mergesort(int array[], int left, int right) {
		if (left >= right) {
			return;
		}
		int mid = (left + right) / 2;
		int i;
		int p = 0, j = 0, k = left;
		mergesort(array, left, mid); // 配列前半部分の整列
		mergesort(array, mid + 1, right); // 配列後半部分の整列
		for (i = left; i <= mid; i++) { // work[]に退避
			work[p++] = array[i];
		}
		while (i <= right && j < p) { // 配列にマージ
			array[k++] = (work[j] <= array[i]) ? work[j++] : array[i++];
		}
		while (j < p) { // 後ろにくっつけていく
			array[k++] = work[j++];
		}
	}
}
