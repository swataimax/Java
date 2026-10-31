package algorithm1;

public class Al1Q1_1 {
	private final int MAX; //格納できる最大要素数
	private int dataLength = 0; //データの個数を格納
	private int array[]; //配列

	public Al1Q1_1(int max) {
		MAX = max;
		array = new int[MAX];
	}

	public boolean insert(int k, int val) { //値valをk番目に挿入
		if (dataLength >= MAX) {
			return (false); //データ数オーバー
		}
		if (k < 0 || k > dataLength) {
			return (false); //kが範囲外
		}
		for (int i = dataLength - 1; i >= k; i--) { //ずらす
			array[i + 1] = array[i];
		}
		array[k] = val; //k番目に挿入
		dataLength++; //データ数を増やす
		return (true);
	}

	public boolean delete(int k) { //k番目の要素を削除
		if (k < 0 || k >= dataLength) {
			return (false); //範囲外
		}
		for (int i = k; i < dataLength - 1; i++) { //ずらす
			array[i] = array[i + 1];
		}
		dataLength--; //データ数を減らす
		return (true);
	}

	public void print() { //配列の状態を表示
		for (int i = 0; i < dataLength; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String args[]) { //main()を変更
		int max = 10000; //要素数

		//先頭に挿入
		Al1Q1_1 ar1 = new Al1Q1_1(max);
		long tm1 = System.nanoTime();
		for (int i = 0; i < max; i++) {
			ar1.insert(0, i);
		}
		long tm2 = System.nanoTime();
		System.out.println("先頭に挿入:" + (tm2 - tm1) + " ns");

		//最後に挿入
		Al1Q1_1 ar2 = new Al1Q1_1(max);
		tm1 = System.nanoTime();
		for (int i = 0; i < max; i++) {
			ar2.insert(i, i);
		}
		tm2 = System.nanoTime();
		System.out.println("最後に挿入:" + (tm2 - tm1) + " ns");
	}
}
