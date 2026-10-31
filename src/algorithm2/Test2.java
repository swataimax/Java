package algorithm2;

public class Test2 {

	public static void main(String[] args) {
		
		// LinearSearch1
		LinearSearch1 ls = new LinearSearch1(100);
		ls.print();
		for (int i = 5; i >= 0; i--) {
			ls.insert(new Record(i, "" + (char) ('A' + i)));
			ls.print();
		}
		System.out.println("key=3 --> " + ls.search(3));
		System.out.println("key=5 --> " + ls.search(5));
		
		while (!ls.empty()) {
			ls.delete(0); // 先頭を削除
			ls.print();
		}
		
		
		System.out.println("---");
		
		
		// LinearSearch2
		LinearSearch2 ls2 = new LinearSearch2(100);
		ls2.print();
		for (int i = 5; i >= 0; i--) {
			ls2.insert(new Record(i, "" + (char) ('①' + i)));
			ls2.print();
		}
		System.out.println("key=3 -->" + ls2.search(3));
		while (!ls2.empty()) {
			ls2.delete(0); // 先頭を削除
			ls2.print();
		}
		
		
		System.out.println("---");
		
		
		// 問題５①
		
		
		System.out.println("---");
		
		
		
		// 問題５②
		
		
		System.out.println("---");
		
		
		// LinearSearch3
		LinearSearch3 ls3 = new LinearSearch3();
		ls3.print();
		for (int i = 0; i < 5; i++) {
			ls3.insert(i, "" + (char) ('①' + i));
			ls3.print();
		}
		Record2 rec = ls3.search(3); //キーの値が3を探索
		if (rec != null) {
			System.out.println("key=3 --> " + rec.str);
		}
		while (!ls3.empty()) {
			ls3.delete(ls3.head.next); //先頭を削除
			ls3.print();
		}
		
		
		System.out.println("---");
		
		
		// BinarySearch
		BinarySearch1 bs = new BinarySearch1(100);
		for (int i = 10; i <= 30; i += 2) { //データの追加
			bs.insert(new Record(i, "" + (char) ('Ａ' + i)));
		}
		bs.print(); //状態表示
		System.out.println("18 ---> " + bs.search(18));
		System.out.println("19 ---> " + bs.search(19));
		System.out.println("-5 ---> " + bs.search(-5));
		System.out.println("40 ---> " + bs.search(40));
		
		
		System.out.println("---");
		
		
		// Hash1
		Hash1 hs1 = new Hash1(13);
		hs1.dump(); //初期状態表示
		hs1.add(1, "佐藤"); //データの追加
		hs1.add(5, "渡辺");
		hs1.add(10, "加藤");
		hs1.add(12, "山田");
		hs1.add(14, "山口");
		hs1.add(27, "高橋");
		hs1.dump(); //状態表示
		System.out.println("key=5:" + hs1.search(5)); //探索
		hs1.remove(14); //削除
		hs1.dump(); //状態表示
		hs1.remove(1); //削除
		hs1.remove(5);
		hs1.dump(); //状態表示
		
		

	}

}
