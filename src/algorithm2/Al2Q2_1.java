package algorithm2;

import java.util.Scanner;

public class Al2Q2_1 {
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
		if (listhead == null) { //削除する要素がない
			return;
		}
		listhead = listhead.next;
	}

	void print() { //リストを先頭から表示
		for (Cell p = listhead; p != null; p = p.next) {
			System.out.print(p.value + " ");
		}
		System.out.println();
	}

	int search(int target) {
		Cell p = listhead;
		for (int index = 0; p != null; p = p.next, index++) {
			if (target == p.value) {
				return (index);
			}
		}
		return -1;
	}

	public static void main(String args[]) {
		Al2Q2_1 ar = new Al2Q2_1();
		for (int i = 0; i < 10; i++) {
			ar.inserthead((int) (Math.random() * 10));
		}
		ar.print();
		Scanner scn = new Scanner(System.in);
		System.out.print("検索する値？> ");
		int num = scn.nextInt();
		int idx = ar.search(num);
		if (idx >= 0) {
			System.out.println(num + "は" + idx + "番目で見つかりました");
		} else {
			System.out.println(num + "は見つかりませんでした");
		}
		scn.close();
	}
}

class Cell {
	int value; //データ
	Cell next; //ポインター
}
