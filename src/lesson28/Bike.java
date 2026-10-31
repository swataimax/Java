package lesson28;

class Bike implements Vehicle {
	public void engine() {
		System.out.println("制限速度：" + speed);
		System.out.println("バイク　エンジン起動");
	}

	public void tire() {
		System.out.println("タイヤ2つ");
	}
}
