package lesson28;

public class Sample0208_12 implements OvenRange {
	public static void main(String[] args) {
		OvenRange or = new Sample0208_12();
		// サブIFの変数でスーパーIFのメソッド呼び出し
		or.grill();
		// サブIFの変数でサブIFのメソッド呼び出し
		or.microwave();
		Oven ov = new Sample0208_12();
		// スーパーIFの変数でスーパーIFのメソッド呼び出し
		ov.grill();
		// スーパーIFの変数でサブIFのメソッド呼び出し　→　コンパイルエラー
		// ov.microwave();
		((OvenRange) ov).microwave(); // サブIFにキャスト
	}

	public void grill() {
		System.out.println("グリル");
	}

	public void microwave() {
		System.out.println("電子レンジ");
	}
}
