package lesson32;

public class Sample0302_10 {
	public static void main(String[] args) {
		// Student2に変更して実行してみよう
		Object obj = new Student(1, "山田");
//		Object obj = new Student2(1, "山田");

		// instanceOf
		if (obj instanceof Student(int x, String y)) {
			System.out.println(x + ", " + y);
//		} else {
//			System.out.println("instanceOf パターンアンマッチ");
		}
		// こちらはelse文を書かなくてもコンパイルエラーにはならないが
		
		// switch文
		switch (obj) {
		case Student(int x, String y) -> System.out.println(x + ", " + y);
		default -> System.out.println("switch文：パターンアンマッチ");
		}
		// defaultを書かない（網羅的でない）とコンパイルエラーになる
		
		
		// switch式
		String result = switch (obj) {
		case Student(int x, String y) -> x + ", " + y;
		default -> "switch式：パターンアンマッチ";
		};
		System.out.println(result);

		// ↑レコードパターン使用

		// ↓レコードパターン未使用

		if (obj instanceof Student st) {
			int id = st.id();
			String name = st.name();
			System.out.println(id + ", " + name);
		}

	}
}
