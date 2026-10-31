package algorithm1;

import java.util.Random;

public class Al1Q3_1 {
	int stack[];
	int sp;

	Al1Q3_1(int max) {
		stack = new int[max];
		sp = -1; //スタックの初期化
	}

	void push(int val) { //プッシュ
		if (sp >= stack.length - 1) {
			throw new UnsupportedOperationException();
		}
		sp = sp + 1;
		stack[sp] = val;
	}

	int pop() { //ポップ
		if (sp < 0) {
			throw new UnsupportedOperationException();
		}
		int val = stack[sp];
		sp = sp - 1;
		return val;
	}

	void print() { //スタックの状態を表示
		for (int i = 0; i <= sp; i++) {
			System.out.print(stack[i] + " ");
		}
		System.out.println("(sp=" + sp + ")");
	}

	public static void main(String args[]) {
		Al1Q3_1 st = new Al1Q3_1(100);
		
		Random rnd = new Random();
		
		for (int i = 0; i < 10; i++) {
//			st.push((int) (Math.random() * 90) + 10);
			st.push((int) (rnd.nextDouble() * 90) + 10);
			//  0以上  1未満
			//  0以上 90未満
			// 10以上100未満
		}
		st.print();
		while (st.sp >= 0) {
			System.out.print(st.pop() + " ");
		}
		System.out.println();
	}
}
