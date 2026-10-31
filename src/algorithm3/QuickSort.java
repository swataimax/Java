package algorithm3;

public class QuickSort implements Sort {
	public static void main(String args[]) {
		new SortTester(10, new QuickSort(), true);
	}

	public void sort(int[] array) {
		qsort(array, 0, array.length - 1);
	}

	void qsort(int[] array, int left, int right) {
		if (left < right) {
			int pivot = array[(left + right) / 2];	// 基準値
			System.out.println("left: " + left + "\t" + array[left]);
			System.out.println("right:" + right + "\t" + array[right]);
			System.out.println("pivot:" + pivot);
			
			int i = left;
			int j = right;
			do {
				while (array[i] < pivot) {	// 基準値pivot以上のものを見つける
					i++;
				}
				while (array[j] > pivot) {	// 基準値pivot以下のものを見つける
					j--;
				}
				if (i <= j) {				// i番目とj番目を入れ替え
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
					i++;	// 左に移動
					j--;	// 右に移動
				}
				SortTester.print(array);
			
			} while (i <= j);	// 配列左端と右端が同じ値になるまで繰り返す
			
			SortTester.print(array);
			
			qsort(array, left, j); 	// 左側の整列
			qsort(array, i, right); // 右側の整列
		}
	}
}

