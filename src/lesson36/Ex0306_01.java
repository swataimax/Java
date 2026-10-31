package lesson36;

public class Ex0306_01 {
	public static void main(String[] args) {
		hello(10);
	}

	static void hello(int a) {
		System.out.println("完全一致");
	}

	static void hello(long a) {
		System.out.println("暗黙の型変換");
	}

	static void hello(Integer a) {
		System.out.println("ボクシング変換");
	}

	static void hello(int... a) {
		System.out.println("可変長引数");
	}
}
