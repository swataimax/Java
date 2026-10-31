package lesson28;

public class Sample0208_13 {
	public static void main(String[] args) {
		Vehicle vc = new Car();
		disp(vc); // Carオブジェクト
		vc = new Bike();
		disp(vc); // Bikeオブジェクト
		disp(new Bike()); // Bikeオブジェクト
	}

	static void disp(Vehicle vc) { // スーパーIFの引数
		vc.engine();
		vc.tire();
		System.out.println(); // 改行
	}
}
