package algorithm1;

public class MyStack {
	int[] stack;
	int sp; // スタックポインター(位置)

	MyStack(int max) { // 引数の値分の要素を確保
		stack = new int[max];
		sp = -1; //スタックの初期化
	}

	void push(int val) { //プッシュ
		if (sp >= stack.length - 1) {
			throw new UnsupportedOperationException();
		}
		sp = sp + 1; // スタック先頭の位置のインデックス+1
		stack[sp] = val; // 先頭要素に値を代入
	}

	int pop() { //ポップ
		if (sp < 0) {
			throw new UnsupportedOperationException();
		}
		int val = stack[sp]; // 先頭要素の値を取得
		sp = sp - 1; // スタック先頭の位置のインデックス-1
		return val;
	}

	void print() { //スタックの状態を表示
		for (int i = 0; i <= sp; i++) {
			System.out.print(stack[i] + " ");
		}
		System.out.println("(sp=" + sp + ")");
	}

	public static void main(String[] args) {
		MyStack st = new MyStack(10);
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
