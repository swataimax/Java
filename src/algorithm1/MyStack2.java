package algorithm1;

public class MyStack2 {
	Cell listhead = null;

	void push(int val) { //プッシュ
		Cell newcell = new Cell();
		newcell.value = val;
		newcell.next = listhead;
		listhead = newcell;
	}

	int pop() { //ポップ
		if (listhead == null) {
			throw new UnsupportedOperationException();
		}
		int val = listhead.value;
		listhead = listhead.next;
		return val;
	}

	void print() { //スタックの状態を表示
		for (Cell p = listhead; p != null; p = p.next) {
			System.out.print(p.value + " ");
		}
		System.out.println();
	}

	public static void main(String args[]) {
		MyStack2 st = new MyStack2();
		st.print();
		st.push(10);
		st.print();
		st.push(20);
		st.print();
		st.push(30);
		st.print();
		System.out.println("POP:" + st.pop());
		st.print();
		st.pop();
		st.print();
		st.pop();
		st.print();
	}
}
