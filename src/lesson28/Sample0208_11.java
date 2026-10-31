package lesson28;

public class Sample0208_11 implements OvenRange {
	public static void main(String[] args) {
		Sample0208_11 sample = new Sample0208_11();
		sample.grill();
		sample.microwave();
	}

	public void grill() { //スーパーインターフェースのメソッドを具象化
		System.out.println("グリル機能");
	}

	public void microwave() { // サブインターフェースのメソッドを具象化
		//変数tempはスーパーインターフェースのフィールド
		System.out.println("温度：" + temp);
		System.out.println("時間：" + time);
		System.out.println("レンジ機能");
	}
}
