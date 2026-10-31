package lesson28;

public class Sample0208_06 implements PC {
	public static void main(String[] args) {
		Sample0208_06 pc = new Sample0208_06();
		pc.print(); //オーバーライドしたメソッドの呼び出し
	}

	public void print() {
		System.out.println("オーバーライドしたprintメソッド");
		PC.super.print(); //デフォルトメソッドの呼び出し
	}
}

//mainメソッドはstaticメソッドであるため、「PC.super.print();」の呼び出しはできない。
//「PC.super.print();」はインスタンスメソッド内であれば呼び出し可能。

