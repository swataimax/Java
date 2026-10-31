package lesson28;

public class FlyingCar implements Vehicle, Propeller {
	public void engine() { // Vehicleインターフェースのメソッド
		System.out.println("制限速度：" + speed);
		System.out.println("車　エンジン起動");
	}

	public void tire() { // Vehicleインターフェースのメソッド
		System.out.println("タイヤ4つ");
	}

	public void fly() { //  Propellerインターフェースのメソッド
		System.out.println("空を飛びます！");
	}
}
