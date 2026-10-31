package algorithm2;

public class BinarySearch1 {
//	Record table[];
	Record[] table;
	int n; // データ数

	public BinarySearch1(int max) {
		table = new Record[max];
	}

	void insert(Record p) { //データの挿入
		if (n >= table.length) {
			return;
		}
		table[n++] = p;
	}

	void print() { // 状態表示
		for (int i = 0; i < n; i++) { // レコードの内容
			System.out.print(
					"(" + table[i].key + "," + table[i].str + ")");
		}
		System.out.println("[" + n + "]"); // レコード数
	}

	int search(int target) { //探索
		int lo = 0; //データの先頭
		int hi = n - 1; //データの最後
		while (lo <= hi) {
			int mid = (lo + hi) / 2; //中央の位置
			if (target < table[mid].key) {
				hi = mid - 1;
			} else if (target > table[mid].key) {
				lo = mid + 1;
			} else {
				return (mid); //見つかった
			}
		}
		return -1; //見つからなかった
	}

	public static void main(String[] args) { //テスト用メイン
		BinarySearch1 bs = new BinarySearch1(100);
		for (int i = 10; i <= 30; i += 2) { //データの追加
			bs.insert(new Record(i, "" + (char) ('Ａ' + i)));
		}
		bs.print(); //状態表示
		System.out.println("18 ---> " + bs.search(18));
		System.out.println("19 ---> " + bs.search(19));
		System.out.println("-5 ---> " + bs.search(-5));
		System.out.println("40 ---> " + bs.search(40));
	}
}
