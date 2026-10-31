package lesson28;

final class Super {
}

class Sub extends Super {
} // finalなクラスを継承でコンパイルエラー

class Sample {
	final void test() {
	}
}

class SubSample extends Sample {
	void test() {
	} // finalなメソッドをオーバーライドでコンパイルエラー
}

public class Sample0208_01 {
	public static final double TAX = 0.1;

	public static void main(String[] args) {
		TAX = 0.08; // finalなフィールドに再代入でコンパイルエラー
	}

	static void foo(final int i) {
	} // 引数をfinalにできる
}
