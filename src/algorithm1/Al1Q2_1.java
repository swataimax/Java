package algorithm1;

public class Al1Q2_1 {
	Cell listhead = null; //リストの先頭情報

	void insert(Cell previous, int val) { //挿入(先頭以外)
		Cell newcell = new Cell(); //新しいセルを確保
		newcell.value = val; //セルに値を入れる
		newcell.next = previous.next; //次に繋がるセルを連結
		previous.next = newcell; //前のセルに連結
	}

	void inserthead(int val) { //先頭に挿入
		Cell newcell = new Cell(); //新しいセルを確保
		newcell.value = val; //セルに値を入れる
		newcell.next = listhead; //次に繋がるセルを連結
		listhead = newcell; //リストの先頭情報に連結
	}

	void delete(Cell previous) { //削除(先頭以外)
		previous.next = previous.next.next; //次のセルを前に連結
	}

	void deletehead() { //先頭から削除
		if (listhead == null) {
			return; //削除する要素がない
		}
		listhead = listhead.next;
	}

	void print() { //リストを先頭から表示
		for (Cell p = listhead; p != null; p = p.next) {
			System.out.print(p.value + " ");
		}
		System.out.println();
	}

	public static void main(String args[]) { //main()を変更
		Al1Q2_1 ml = new Al1Q2_1();

		//先頭に追加
		long tm1 = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			ml.inserthead(i);
		}
		long tm2 = System.nanoTime();
		System.out.println("先頭に挿入　:" + (tm2 - tm1) + " ns");

		//先頭から削除
		tm1 = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			ml.deletehead();
		}
		tm2 = System.nanoTime();
		System.out.println("先頭から削除:" + (tm2 - tm1) + " ns");
	}
}

//class Cell {
//	int value; //データ
//	Cell next; //ポインター
//}
