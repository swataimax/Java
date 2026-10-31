package lesson28;

class Car implements Vehicle {
	public void engine() { // 抽象メソッドをオーバーライド
		System.out.println("制限速度：" + speed); // 定数フィールド
		System.out.println("車　エンジン起動");
	}

	public void tire() { // 抽象メソッドをオーバーライド
		System.out.println("タイヤ4つ");
	}
}
