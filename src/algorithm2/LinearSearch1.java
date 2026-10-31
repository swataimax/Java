package algorithm2;

public class LinearSearch1 {
	Record[] table; // レコード格納配列
	int n = 0; // データ数

	LinearSearch1(int max) {
		table = new Record[max];
	}

	int search(int target) { // 検索
		for (int i = 0; i < n; i++) {
			if (target == table[i].key) {
				return i;
			}
		}
		return -1;
	}

	boolean insert(Record x) { // 挿入
		if (n >= table.length) {
			return false;
		}
		// nはデータ数のため常に最後のインデックスに挿入する
		table[n] = x;
		n = n + 1;
		return true;
	}

	boolean delete(int pos) { // 削除
		if (pos < 0 || pos > n - 1) {
			return false;
		}
		for (int i = pos; i < n - 1; i++) {
			table[i] = table[i + 1];
		}
		n = n - 1;
		return true;
	}

	boolean empty() { // 空の判定
		return n == 0;
	}

	void print() { //状態表示
		for (int i = 0; i < n; i++) { //レコードの内容
			System.out.print(
					"(" + table[i].key + ", " + table[i].str + ")");
		}
		System.out.println("[" + n + "]"); //レコード数
	}

	public static void main(String[] args) {
		LinearSearch1 ls = new LinearSearch1(100);
		ls.print();
		for (int i = 5; i >= 0; i--) {
			ls.insert(new Record(i, "" + (char) ('①' + i)));
			ls.print();
		}
		System.out.println("key=3 --> " + ls.search(3));
		while (!ls.empty()) {
			ls.delete(0); // 先頭を削除
			ls.print();
		}
	}
}
