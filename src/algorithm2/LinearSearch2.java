package algorithm2;

public class LinearSearch2 {
	Record[] table;
	int n = 0; //データ数

	LinearSearch2(int max) {
		table = new Record[max];
	}

	int search(int target) {//番兵を利用
		table[n] = new Record(target, "dummy"); //番兵を配置
		int i; //return文で使うのでforの外に出す
		for (i = 0; target != table[i].key; i++) {
		}
		return i < n ? i : -1;
	}

	boolean insert(Record x) { //挿入：番兵用に一つ領域を確保
		if (n >= table.length - 1) {
			return false;
		}
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

	boolean empty() { // 空か判定
		return n == 0;
	}

	void print() {
		for (int i = 0; i < n; i++) {
			System.out.print(table[i].key + ", " + table[i].str);
		}
		System.out.println("[" + n + "]");
	}

	public static void main(String[] args) {
		LinearSearch2 ls = new LinearSearch2(100);
		ls.print();
		for (int i = 5; i >= 0; i--) {
			ls.insert(new Record(i, "" + (char) ('①' + i)));
			ls.print();
		}
		System.out.println("key=3 -->" + ls.search(3));
		while (!ls.empty()) {
			ls.delete(0); // 先頭を削除
			ls.print();
		}
	}
}
