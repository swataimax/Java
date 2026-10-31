package algorithm2;

public class Al2Q3_1 {
//	Record table[];
	Record[] table;
	int n; // データ数

	public Al2Q3_1(int max) {
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
			System.out.print("(" + table[i].key + "," + table[i].str + ") ");
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
				return mid; //見つかった
			}
		}
		return -1; //見つからなかった
	}

	boolean insert(int k, Record p) {
		if (n >= table.length) {
			return false;
		}
		if (k < 0 || k > n) {
			return false;
		}
		for (int i = n - 1; i >= k; i--) {
			table[i + 1] = table[i];
		}
		table[k] = p;
		n++;
		return true;
	}

	boolean delete(int k) {
		if (k < 0 || k >= n)
			return false;
		for (int i = k; i < n - 1; i++) {
			table[i] = table[i + 1];
		}
		n--;
		return true;
	}

	public static void main(String[] args) { //テスト用メイン
		Al2Q3_1 bs = new Al2Q3_1(100);
		for (int i = 10; i <= 30; i += 2) { //データの追加
			bs.insert(new Record(i, "" + (char) ('Ａ' + i)));
		}
		bs.print(); //状態表示
		bs.insert(0, new Record(0, "0")); //先頭に挿入
		bs.print(); //状態表示
		bs.insert(3, new Record(0, "3")); //3番目に挿入
		bs.print(); //状態表示
		bs.insert(bs.n, new Record(50, "E")); //最後に挿入
		bs.print(); //状態表示
		System.out.println("18 ---> " + bs.search(18));
		System.out.println("19 ---> " + bs.search(19));
		System.out.println("-5 ---> " + bs.search(-5));
		System.out.println("40 ---> " + bs.search(40));
		bs.delete(0); //最初を削除
		bs.print(); //状態表示
		bs.delete(2); //2番めを削除
		bs.print(); //状態表示
		bs.delete(bs.n - 1); //最後を削除
		bs.print(); //状態表示
	}
}

//class Record {
//	int key; // キー
//	String str; // 格納データ
//
//	Record(int key, String str) {
//		this.key = key;
//		this.str = str;
//	}
//}
