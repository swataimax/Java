package algorithm1;

public class MyArray {
	private final int MAX; // 格納できる最大要素数
	private int dataLength = 0; // データの個数を格納
	private int[] array; // 配列

	public MyArray(int max) {
		MAX = max;
		array = new int[MAX];
	}

	public boolean insert(int k, int val) { // k番目に値valを挿入
		if (dataLength >= MAX) { // データ数オーバー
			return false;
		}
		if (k < 0 || k > dataLength) { // kが範囲外
			return false;
		}

		for (int i = dataLength - 1; i >= k; i--) {// 最後の要素から
			array[i + 1] = array[i]; // 現在の要素を1つ後ろにずらす
		}
		array[k] = val; // 値valをk番目のインデックスに挿入
		dataLength++; // データの個数をインクリメント
		return true; // 値を挿入できたのでtrueを返却
	}

	public boolean delete(int k) { // k番目の要素を削除
		if (k < 0 || k > dataLength) { // データ数オーバー
			return false;
		}
		for (int i = k; i < dataLength - 1; i++) {// 先頭の要素から
			array[i] = array[i + 1]; // 1つ後ろの要素を現在の要素にずらす
		}
		dataLength--; // データの個数をデクリメント
		return true; // 値を削除できたのでtrueを返却
	}

	public void print() { // 配列の状態を表示
		for (int i = 0; i < dataLength; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		MyArray ar = new MyArray(10); // 最大要素数10で作成
		for (int i = 1; i < 10; i++) { // 1から10を要素に持つ配列を作成
			ar.insert(0, i);
			ar.print();
		}
		ar.insert(5, 5); // インデックス5に値5を挿入
		ar.print(); // 状態を表示
		ar.delete(3); // インデックス3の要素を削除
		ar.print(); // 状態を表示
	}
}
