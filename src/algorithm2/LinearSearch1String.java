package algorithm2;

import java.util.Scanner;

public class LinearSearch1String {
	RecordString[] table; // レコード格納配列
	int n = 0; // データ数

	LinearSearch1String(int max) {
		table = new RecordString[max];
	}

	int search(String target) { // 検索
		for (int i = 0; i < n; i++) {
			if (target == table[i].key) {	// なぜ==で比較できる？
//			if (target.equals(table[i].key)) {	// なぜ==で比較できる？
				return i;
			}
		}
		return -1;
	}

	boolean insert(RecordString x) { // 挿入
		if (n >= table.length) {
			return false;
		}
		// nはデータ数のため常に最後のインデックスに挿入する
		table[n] = x;
		n = n + 1;
		return true;
	}

	boolean delete(int pos) { // 削除
		if (pos < 0 || pos > n - 1) {
			return false;
		}
		for (int i = pos; i < n - 1; i++) {
			table[i] = table[i + 1];
		}
		n = n - 1;
		return true;
	}

	boolean empty() { // 空の判定
		return n == 0;
	}

	void print() { //状態表示
		for (int i = 0; i < n; i++) { //レコードの内容
			System.out.print(
					"(" + table[i].key + ", " + table[i].str + ")");
		}
		System.out.println("[" + n + "]"); //レコード数
	}

	public static void main(String[] args) {
		LinearSearch1String ls = new LinearSearch1String(100);
		ls.print();
		ls.insert(new RecordString("AAAAAA","Aa"));
		ls.print();
		ls.insert(new RecordString("BBBBB","Bb"));
		ls.print();
		ls.insert(new RecordString("CCCC","Cc"));
		ls.print();
		ls.insert(new RecordString("DD","Dd"));
		ls.print();
		ls.insert(new RecordString("E","Ee"));
		ls.print();

		System.out.println("key=A --> " + ls.search("A"));
		System.out.println("key=BBBBB --> " + ls.search("BBBBB"));
		System.out.println("key=CCCC --> " + ls.search("CCCC"));
		System.out.println("key=E --> " + ls.search("E"));
		System.out.println("key=F --> " + ls.search("F"));
		System.out.println("key=AAAAAA --> " + ls.search("AAAAAA"));
		
		
		
		System.out.println("-----");
		
		Scanner scn = new Scanner(System.in);
		System.out.print("検索する値？> ");
		String ss = scn.nextLine();
		System.out.println(ss);
		System.out.println("key=" + ss + " --> " + ls.search(ss));
		System.out.print("検索する値？> ");
		ss = scn.nextLine();
		System.out.println(ss);
		System.out.println("key=" + ss + " --> " + ls.search(ss));
		System.out.print("検索する値？> ");
		ss = scn.nextLine();
		System.out.println(ss);
		System.out.println("key=" + ss + " --> " + ls.search(ss));
		
		
		System.out.println("-----");
		
		ss = new String("CCCC");
		System.out.println(ss);
		System.out.println("key=" + ss + " --> " + ls.search(ss));
		
		
		System.out.println("-----");
		
		while (!ls.empty()) {
			ls.delete(0); // 先頭を削除
			ls.print();
		}
		
		
		
		// Stringの比較の確認
		String s1 = "AAAAAAAAAAA";
		String s2 = "AAAAAAAAAAA";
		System.out.println(s1 == s2);		// true
		System.out.println(s1.equals(s2));	// true
		
		String foo = "Orange";
		String bar = new String("Orange");
		System.out.println(foo == bar);			// false
		System.out.println(foo.equals(bar));	// true
		
		String foo2 = "Orange";
		String bar2 = "Orange";
		System.out.println(foo2 == bar2);		// true
		System.out.println(foo2.equals(bar2));	// true
		
		// https://www.sejuku.net/blog/14621
		// https://academy.cyzennt.co.jp/blog/java%E3%81%A7%E6%96%87%E5%AD%97%E5%88%97%E3%82%92%E6%AF%94%E3%81%B9%E3%82%8B%E6%96%B9%E6%B3%95%E3%81%BE%E3%81%A8%E3%82%81%EF%BC%9Aequals%E3%83%BB%E3%83%BBcompareto%E3%83%BBequalsignorecase%E3%81%AE/
		
		// ==を使うと、文字列の中身ではなく、参照先（メモリ上の場所）が同じかどうかを比較
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1 == str2); // true（同じリテラルを使っているため）

		String str3 = new String("Hello");
		System.out.println(str1 == str3); // false（newで新しく作られたため）
		
		// リテラル文字列はJavaの「文字列プール」に格納され、==でもtrueになることがありますが、
		// newで生成した文字列はヒープに格納されるため、==ではfalseになります。
		
		// https://qiita.com/HyunwookPark/items/852153f1db6e4a901032
		// Javaがメモリ使用量を抑えるために同じ文字列の場合は同じメモリ領域の内容を再利用するため。
		// ただ、同じ文字列でも再利用される場合とそうでない場合がある。
		
	}
}
