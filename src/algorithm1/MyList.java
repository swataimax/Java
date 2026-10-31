package algorithm1;

public class MyList {
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
			return;
		} //削除する要素がない
		listhead = listhead.next;
	}

	void print() { //リストを先頭から表示
		for (Cell p = listhead; p != null; p = p.next) {
			System.out.print(p.value + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		MyList ml = new MyList();
		for (int i = 1; i < 10; i++) {
			ml.inserthead(i); //先頭に挿入
			ml.print(); //状態を表示
		}
		ml.insert(ml.listhead.next, 10); //2番目に挿入
		ml.print(); //状態を表示
		ml.delete(ml.listhead); //1番目の要素を削除
		ml.print(); //状態を表示
		ml.deletehead(); //先頭を削除
		ml.print();
	}
}
