package algorithm2;

public class LinearSearch3 {
	Record2 head; //リストの先頭
	Record2 tail; //リストの末尾

	LinearSearch3() { // 初期化
		head = new Record2(-1, "top"); // リストの先頭
		tail = new Record2(-1, "last"); // リストの末尾
		head.next = tail; // 先頭(ダミー)の次は番兵
		tail.prev = head; // 番兵の前は先頭(ダミー)
	}

	Record2 search(int target) { // 探索
		tail.key = target; // 番兵にキーをセット
		Record2 p = head.next; // ダミーの次から探索
		while (target != p.key) {
			p = p.next;
		}
		return p != tail ? p : null; //番兵以外で発見
	}

	void insert(int key, String str) { // 先頭に挿入
		Record2 newcell = new Record2(key, str);
		newcell.next = head.next;
		head.next.prev = newcell;
		head.next = newcell;
		newcell.prev = head;
	}

	void delete(Record2 p) { // 先頭から削除
		if (head.next == tail) { // データなし
			return;
		}
		if (p == head || p == tail) { // ダミーデータ
			return;
		}
		p.prev.next = p.next;
		p.next.prev = p.prev;
	}

	boolean empty() { //空か判定
		return head.next == tail; // ダミーの間に何もない
	}

	void print() { //先頭から表示
		for (Record2 p = head.next; p != tail; p = p.next) {
			System.out.print("(" + p.key + "," + p.str + ")");
		}
		System.out.println();
	}

	public static void main(String args[]) { //テスト用メイン
		LinearSearch3 ls = new LinearSearch3();
		ls.print();
		for (int i = 0; i < 5; i++) {
			ls.insert(i, "" + (char) ('①' + i));
			ls.print();
		}
		Record2 rec = ls.search(3); //キーの値が３を探索
		if (rec != null) {
			System.out.println("key=3 --> " + rec.str);
		}
		while (!ls.empty()) {
			ls.delete(ls.head.next); //先頭を削除
			ls.print();
		}
	}
}
