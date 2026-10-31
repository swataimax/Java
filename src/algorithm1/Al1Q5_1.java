package algorithm1;

public class Al1Q5_1 {
	Node root;

	Al1Q5_1() { //手作りで木を作成
		root = new Node("F",
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
	}

	void preorder(Node p) { //前順走査
		if (p == null) {
			return;
		}
		System.out.print("(" + p.value);
		preorder(p.left);
		preorder(p.right);
		System.out.print(")");
	}

	void inorder(Node p) { //間順走査
		if (p == null) {
			return;
		}
		System.out.print("(");
		inorder(p.left);
		System.out.print(p.value);
		inorder(p.right);
		System.out.print(")");
	}

	void postorder(Node p) { //後順走査
		if (p == null) {
			return;
		}
		System.out.print("(");
		postorder(p.left);
		postorder(p.right);
		System.out.print(p.value + ")");
	}

	public static void main(String args[]) { //テスト用メイン
		Al1Q5_1 tree = new Al1Q5_1();
		tree.inorder(tree.root);
		System.out.println();
	}
}

//class Node{ //ノード
//        String value;
//        Node   left;
//        Node   right;
//        Node(String value, Node left, Node right){
//                this.value = value;
//                this.left  = left;
//                this.right = right;
//        }
//}
