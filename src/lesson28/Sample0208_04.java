package lesson28;

public class Sample0208_04 implements Vehicle {
	void engine() { // publicをつけていないのでコンパイルエラー
		System.out.println("車　エンジン起動");
	}

	void tire() { // publicをつけていないのでコンパイルエラー
		System.out.println("タイヤ4つ");
	}
}
