package algorithm1;

class Node { // ノード
	String value; // 値
	Node left; // 左辺の子ノード
	Node right; // 右辺の子ノード

	Node(String value, Node left, Node right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}
}
