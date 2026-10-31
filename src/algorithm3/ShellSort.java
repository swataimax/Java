package algorithm3;

public class ShellSort implements Sort {
	public static void main(String args[]) {
		new SortTester(10, new ShellSort(), true);
	}

	public void sort(int[] array) {
		int h; // 間隔
		for (h = 1; h < array.length; h = 3 * h + 1)
			; // 間隔の算出
		for (h /= 3; h > 0; h /= 3) {
			for (int i = h; i < array.length; i++) { // 挿入ソート
				int tmp = array[i]; // 挿入する要素を一時退避
				int j = i - h; //インデックスを動かす間隔を可変にする
				// 先頭要素ではない、かつ、挿入する要素 < 1つ前の要素の場合
				while (j >= 0 && tmp < array[j]) {
					array[j + h] = array[j]; // 間隔の離れた要素を上書き
					j -= h; // 間隔分、要素を右に移動させる
				}
				array[j + h] = tmp; // 整列済み要素の次の要素を上書き
			}
		}
	}
}
