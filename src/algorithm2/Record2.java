package algorithm2;

public class Record2 { // 双方向リスト
	int key; 		//キー
	String str; 	//格納データ
	Record2 prev; 	//前のリスト
	Record2 next; 	//後のリスト

	Record2(int key, String str) {
		this.key = key;
		this.str = str;
	}
}
