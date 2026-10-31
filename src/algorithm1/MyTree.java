package algorithm1;

public class MyTree {
	Node root; // ノード

	MyTree() { //手作りで木を作成
		root = new Node("*",
				new Node("+",
						new Node("a", null, null),
						new Node("b", null, null)),
				new Node("-",
						new Node("c", null, null),
						new Node("/",
								new Node("d", null, null),
								new Node("e", null, null))));
	}

	void preorder(Node p) { //前順走査
		if (p == null) {
			return;
		}
		System.out.print("(" + p.value); // 自ノードの値を表示
		preorder(p.left); // 左辺の子ノードを走査
		preorder(p.right); // 右辺の子ノードを走査
		System.out.print(")");
	}

	void inorder(Node p) { //間順走査
		if (p == null) {
			return;
		}
		System.out.print("(");
		inorder(p.left); // 先に左辺の子ノードを走査
		System.out.print(p.value); // 次に自ノードの値を表示
		inorder(p.right); // 右辺の子ノードを走査
		System.out.print(")");
	}

	void postorder(Node p) { //後順走査
		if (p == null) {
			return;
		}
		System.out.print("(");
		postorder(p.left); // 最初に左辺の子ノードを走査
		postorder(p.right); // 次に右辺の子ノードを走査
		System.out.print(p.value + ")"); // 最後に自ノードの値を表示
	}

	public static void main(String[] args) { //テスト用メイン
		MyTree tree = new MyTree();
		tree.preorder(tree.root); // 前順走査
		System.out.println();
		tree.inorder(tree.root); // 間順走査
		System.out.println();
		tree.postorder(tree.root); // 後順走査
	}
}
