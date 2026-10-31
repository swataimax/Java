package algorithm2;

public class Al2Q4_1 {
	int max; //ハッシュ表のサイズ
//	Node2 table[]; //ハッシュ表
	Node2[] table; //ハッシュ表

	Al2Q4_1(int max) {
		table = new Node2[max];
		this.max = max;
	}

	int hashValue(int key) {
		return key % max; //ハッシュ関数
	}

	String search(int key) { //探索
		int hash = hashValue(key);
		Node2 p = table[hash];
		while (p != null) {
			if (p.key == key)
				return p.val;
			p = p.next;
		}
		return null;
	}

	boolean add(int key, String val) { //追加
		int hash = hashValue(key);
		Node2 p = table[hash];
		while (p != null) {
			if (p.key == key)
				return false;
			p = p.next;
		}
		table[hash] = new Node2(key, val, table[hash]);
		return true;
	}

	boolean remove(int key) { //削除
		int hash = hashValue(key);
		Node2 p = table[hash];
		Node2 pp = null;
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

	void print() { //ハッシュ表全体の状態を表示
		System.out.println("-----");
		for (int i = 0; i < max; i++) {
			if (table[i] != null) {
				Node2 p = table[i];
				System.out.print(i < 10 ? "0" + i : i);
				while (p != null) {
					System.out.print(" -> " + ((p.key < 10 ? " " : "") + p.key) + "(" + p.val + ")");
					p = p.next;
				}
				System.out.println();
			} 
//			  else {
//				System.out.print(i < 10 ? "0" + i : i);
//				System.out.print(" null");
//				System.out.println();
//			}
		}
		System.out.println("-----");
	}

	public static void main(String[] args) { //テスト用メイン
		Al2Q4_1 hs1 = new Al2Q4_1(13);
		hs1.add(1, "佐藤");
		hs1.add(5, "渡辺");
		hs1.add(10, "加藤");
		hs1.add(12, "山田");
		hs1.add(14, "山口");
		hs1.print(); //状態表示
	}
}

class Node2 {
	int key; //キー
	String val; //データ
	Node2 next; //リストの次の要素へのポインタ

	Node2(int key, String val, Node2 next) {
		this.key = key;
		this.val = val;
		this.next = next;
	}
}
