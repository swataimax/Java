package algorithm2;

public class Hash1 {
	int max; //ハッシュ表のサイズ
//	Node table[]; //ハッシュ表
	Node[] table; //ハッシュ表

	Hash1(int max) {
		table = new Node[max];
		this.max = max;
	}

	int hashValue(int key) { //ハッシュ関数
		return key % max;
	}

	String search(int key) { //探索
		int hash = hashValue(key);
		Node p = table[hash];
		while (p != null) {
			if (p.key == key)
				return (p.val);
			p = p.next;
		}
		return null;
	}

	boolean add(int key, String val) { //追加
		int hash = hashValue(key);
		Node p = table[hash];
		while (p != null) {
			if (p.key == key)
				return (false);
			p = p.next;
		}
		table[hash] = new Node(key, val, table[hash]);
		return true;
	}

	boolean remove(int key) { //削除
		int hash = hashValue(key);
		Node p = table[hash];
		Node pp = null;
		while (p != null) {
			if (p.key == key) {
				if (pp == null) {
					table[hash] = p.next;
				} else {
					pp.next = p.next;
				}
				return true;
			}
			pp = p;
			p = p.next;
		}
		return false;
	}

	void dump() { //ハッシュ表全体の状態を表示
		System.out.println("-----");
		for (int i = 0; i < max; i++) {
			Node p = table[i];
			System.out.print((i < 10 ? "0" : "") + i);
			while (p != null) {
				System.out.print(" -> " +
						((p.key < 10 ? " " : "") + p.key) + "(" + p.val + ")");
				p = p.next;
			}
			System.out.println();
		}
		System.out.println("-----");
	}

	public static void main(String args[]) { //テスト用メイン
		Hash1 hs1 = new Hash1(13);
		hs1.dump(); //初期状態表示
		hs1.add(1, "佐藤"); //データの追加
		hs1.add(5, "渡辺");
		hs1.add(10, "加藤");
		hs1.add(12, "山田");
		hs1.add(14, "山口");
		hs1.add(27, "高橋");
		hs1.dump(); //状態表示
		System.out.println("key=5:" + hs1.search(5)); //探索
		hs1.remove(14); //削除
		hs1.dump(); //状態表示
		hs1.remove(1); //削除
		hs1.remove(5);
		hs1.dump(); //状態表示
	}
}
