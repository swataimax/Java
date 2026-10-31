package algorithm2;

class Node {
	int key; //キー
	String val; //データ
	Node next; //リストの次の要素へのポインタ

	Node(int key, String val, Node next) {
		this.key = key;
		this.val = val;
		this.next = next;
	}
}
