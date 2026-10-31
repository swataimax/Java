package algorithm1;

public class Test20260528 {

	public static void main(String[] args) {
		
		// MyArray
		MyArray ma = new MyArray(10);
		ma.print();
		for (int i = 1; i < 10; i++) {
			ma.insert(i-1, i);
		}
		ma.print();
		ma.insert(5, 5);
		ma.print();
		ma.delete(3);
		ma.print();
		
		
		// 問題１
		int max = 10000;
		
		//先頭に挿入
		MyArray a1 = new MyArray(max);
		long tm1 = System.nanoTime();
		for (int i = 0; i < max; i++) {
			a1.insert(0, i);
		}
		long tm2 = System.nanoTime();
		System.out.println("先頭に挿入:" + (tm2 - tm1) + " ns");
		
		//最後に挿入
		MyArray a2 = new MyArray(max);
		tm1 = System.nanoTime();
		for (int i = 0; i < max; i++) {
			a2.insert(i, i);
		}
		tm2 = System.nanoTime();
		System.out.println("最後に挿入:" + (tm2 - tm1) + " ns");
		
		
		System.out.println("-----");
		
		
		// MyList
		MyList ml = new MyList();
		for (int i = 1; i < 10; i++) {
			ml.inserthead(i);
			ml.print();
		}
		ml.insert(ml.listhead.next, 10); // 引数の次に挿入する
		ml.print();
		ml.delete(ml.listhead); // 削除する要素の1つ前の要素を引数にする
		ml.print();
		ml.deletehead(); // 先頭を削除
		ml.print();
		
		System.out.println("-----");
		
		// 問題２
		max = 10000;
		MyList l = new MyList();
		
		//先頭に追加
		tm1 = System.nanoTime();
		for (int i = 0; i < max; i++) {
			l.inserthead(i);
		}
		tm2 = System.nanoTime();
		System.out.println("先頭に挿入:" + (tm2 - tm1) + " ns");

		//先頭から削除
		tm1 = System.nanoTime();
		for (int i = 0; i < max; i++) {
			l.deletehead();
		}
		tm2 = System.nanoTime();
		System.out.println("先頭から削除:" + (tm2 - tm1) + " ns");
		
		System.out.println("-----");
//		//最後に追加
//		tm1 = System.nanoTime();
//		Cell tail = l.listhead;
//		for (Cell c = l.listhead; c.next.equals(null); c = c.next) {
//			System.out.println(c.value);
//			tail = c;
//		}
//		System.out.println(tail.value);
//		for (int i = 0; i < max; i++) {
//			l.inserthead(i);
//		}
//		tm2 = System.nanoTime();
//		System.out.println("最後に追加:" + (tm2 - tm1) + " ns");
//		
//		
//		//最後から削除
		
		
		System.out.println("-----");
		
		
		// MyStack
		MyStack ms = new MyStack(10);
		ms.print();
		ms.push(10);
		ms.print();
		ms.push(20);
		ms.print();
		ms.push(30);
		ms.print();
		System.out.println("POP:" + ms.pop());
		ms.print();
		ms.pop();
		ms.print();
		ms.pop();
		ms.print();
		
		System.out.println("-----");
		
		
		// MyStack2
		MyStack2 ms2 = new MyStack2();
		ms2.print();
		ms2.push(10);
		ms2.print();
		ms2.push(20);
		ms2.print();
		ms2.push(30);
		ms2.print();
		System.out.println("POP:" + ms2.pop());
		ms2.print();
		ms2.pop();
		ms2.print();
		ms2.pop();
		ms2.print();
		
		
		System.out.println("-----");
		
		
		// 問題３
		MyStack st = new MyStack(100);
		for (int i = 0; i < 10; i++) {
			st.push((int) (Math.random() * 90) + 10);
			st.print();
		}
		System.out.println("-");
		st.print();
		System.out.println("-");
		while (st.sp >= 0) {
			System.out.print(st.pop() + " ");
		}
		System.out.println();
		
		
		MyStack2 st2 = new MyStack2();
		for (int i = 0; i < 10; i++) {
			st2.push((int) (Math.random() * 90) + 10);
			st2.print();
		}
		st2.print();
		while (st2.listhead != null) {
			System.out.print(st2.pop() + " ");
		}
		System.out.println();
		
		
		System.out.println("-----");
		
		
		// MyQueue
		MyQueue mq = new MyQueue();
		mq.print();
		for (int i = 1; i <= 5; i++) {
			mq.enterqueue(10 * i);
			mq.print();
		}
		while (!mq.emptyqueue()) {
			System.out.print(mq.removequeue() + " ");
			mq.print();
		}
		
		
		System.out.println("-----");
		
		
		// 問題４
		
		MyQueue q = new MyQueue();
		for (int i = 0; i < 10; i++) {
			q.enterqueue((int) (Math.random() * 90) + 10);
			q.print();
		}
		System.out.print("格納");
		q.print();
		System.out.print("取出[ ");
		while (!q.emptyqueue()) {
			System.out.print(q.removequeue() + " ");
		}
		System.out.println("]");
		
		
		System.out.println("-----");
		
		
		// MyTree
		
		MyTree tree = new MyTree();
		tree.preorder(tree.root); // 前順走査
		System.out.println();
		tree.inorder(tree.root); // 間順走査
		System.out.println();
		tree.postorder(tree.root); // 後順走査
		System.out.println();
		
		
		System.out.println("-----");
		
		
		// 問題５
		
		MyTree mt = new MyTree();
		mt.root = new Node("F",
				new Node("B",
						new Node("A", null, null),
						new Node("D",
								new Node("C", null, null),
								new Node("E", null, null))),
				new Node("G",
						null,
						new Node("I",
								new Node("H", null, null),
								null)));
		mt.preorder(mt.root);
		System.out.println();
		mt.inorder(mt.root);
		System.out.println();
		mt.postorder(mt.root);
		System.out.println();
		
		
		System.out.println("-----");
		
		
		
		
	}

}
