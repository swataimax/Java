package algorithm1;

public class MyQueue {
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

	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.print();
		for (int i = 1; i <= 5; i++) {
			queue.enterqueue(10 * i);
			queue.print();
		}
		while (!queue.emptyqueue()) {
			System.out.print(queue.removequeue() + " ");
			queue.print();
		}
	}
}
