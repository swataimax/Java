package algorithm2;

public class Al2Q2_2 {
	Cell listhead = null; //リストの先頭情報

	Al2Q2_2() {
		Cell newcell = new Cell(); //ダミーにする新しいセルを確保
		newcell.value = Integer.MIN_VALUE; //ダミーなので値は適当
		newcell.next = null;
		listhead = newcell; //ダミーを先頭に連結
	}

	void insert(Cell previous, int val) { //挿入
		Cell newcell = new Cell(); //新しいセルを確保
		newcell.value = val; //セルに値を入れる
		newcell.next = previous.next; //次に繋がるセルを連結
		previous.next = newcell; //前のセルに連結
	}

	void delete(Cell previous) { //削除
		previous.next = previous.next.next; //次のセルを前に連結
	}

	void print() { //リストを先頭から表示
		for (Cell p = listhead.next; p != null; p = p.next) {
			System.out.print(p.value + " ");
		}
		System.out.println();
	}

	public static void main(String args[]) {
		Al2Q2_2 ml = new Al2Q2_2();
		for (int i = 1; i < 10; i++) {
			ml.insert(ml.listhead, i); //先頭に挿入
			ml.print(); //状態を表示
		}
		ml.insert(ml.listhead.next.next, 10); //2番目に挿入
		ml.print(); //状態を表示
		ml.delete(ml.listhead.next); //1番目の要素を削除
		ml.print(); //状態を表示
		while (ml.listhead.next != null) {
			ml.delete(ml.listhead); //先頭を削除
			ml.print(); //状態を表示
		}
	}
}

//class Cell {
//	int value; //データ
//	Cell next; //ポインター
//}
