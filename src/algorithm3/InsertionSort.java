package algorithm3;

public class InsertionSort implements Sort {
	public static void main(String args[]) {
		new SortTester(10, new InsertionSort(), true);
	}

	public void sort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int tmp = array[i]; // 挿入する要素を一時退避
			int j = i - 1; // 挿入する要素の1つ前の要素
			// 先頭要素ではない、かつ、挿入する要素 < 1つ前の要素の場合
			while (j >= 0 && tmp < array[j]) {
				array[j + 1] = array[j]; // 1つ前の要素で上書き
				j--; // 1つ前の要素を探索するためデクリメント
			}
			array[j + 1] = tmp; // 整列済み要素の次の要素を上書き
		}
	}
}
