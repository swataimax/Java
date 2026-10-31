package algorithm3;

public class SelectionSort implements Sort {
	public static void main(String[] args) {
		new SortTester(10, new SelectionSort(), true);
	}
	
	@Override
	public void sort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int minpos = i; //最小値の位置を格納
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minpos]) {
					minpos = j; //最小値の位置だけを記憶
				}
			}
			int tmp = array[i];
			array[i] = array[minpos];
			array[minpos] = tmp;
		}
	}
}
