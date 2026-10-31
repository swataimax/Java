package algorithm1;

public class Al1Q4_1 {
	Cell queuehead = null;
	Cell queuetail = null;

	void enterqueue(int val) { //リストの最後に追加
		Cell newcell = new Cell();
		newcell.value = val;
		newcell.next = null;
		if (queuehead == null) {
			queuehead = newcell;
		} else {
			queuetail.next = newcell;
		}
		queuetail = newcell;
	}

	int removequeue() { //リストの先頭から取り出し
		if (queuehead == null) {
			throw new UnsupportedOperationException();
		}
		int val = queuehead.value;
		queuehead = queuehead.next;
		return val;
	}

	boolean emptyqueue() {
		return queuehead == null;
	}

	void print() {
		System.out.print("[ ");
		for (Cell p = queuehead; p != null; p = p.next) {
			System.out.print(p.value + " ");
		}
		System.out.println("]");
	}

	public static void main(String args[]) {
		Al1Q4_1 queue = new Al1Q4_1();
		for (int i = 0; i < 10; i++) {
			queue.enterqueue((int) (Math.random() * 90) + 10);
		}
		System.out.print("格納");
		queue.print();
		System.out.print("取出[ ");
		while (!queue.emptyqueue()) {
			System.out.print(queue.removequeue() + " ");
		}
		System.out.println("]");
	}
}

//class Cell{
//        int value;
//        Cell next;
//}
