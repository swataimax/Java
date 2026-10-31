package algorithm3;

public class HeapSort implements Sort {
	public static void main(String args[]) {
		new SortTester(10, new HeapSort(), true);
	}

	public void sort(int array[]) {
		// 親要素の最後のインデックスから処理を行う（下から積み上げる）
		for (int i = (array.length - 1) / 2; i >= 0; i--) {
			downheap(array, i, array.length - 1); //a[i]～最後の要素までヒープ化
		}
		for (int i = array.length - 1; i > 0; i--) {
			int tmp = array[0];
			array[0] = array[i];
			array[i] = tmp;
			downheap(array, 0, i - 1); // a[0]～a[i-1]をヒープ化
		}
	}

	void downheap(int a[], int left, int right) {
		int root = a[left]; // ルート(根)
		int c; //大きい方の子ノード
		int p; // 親ノード
		for (p = left; p < (right + 1) / 2; p = c) { // ヒープ化する範囲内
			int cl = p * 2 + 1; // 左の子ノード
			int cr = cl + 1; // 右の子ノード
			// 左右の子ノードで大きい方を比較対象にする
			c = (cr <= right && a[cr] > a[cl]) ? cr : cl;
			if (root >= a[c]) { // 親ノード > 子ノードの場合は入れ替えなし
				break;
			}
			a[p] = a[c]; // 親ノードを子ノードで上書き
		}
		a[p] = root; // ルートで上書き
	}
}
