package sample;

public class Sample extends Animal {
	public static void main(String[] args) {
		eat();
		Animal.eat();
	}
}

// 復習テスト　Java02-05継承　問題３
// eatメソッドは、staticメソッドのため、オブジェクト生成なしに使用できる


// 02-02. インスタンスメンバ・クラスメンバ
// p23
// クラスメソッドを参照するとき、「クラス名.クラスメソッド」で参照する。
//（自身のクラスから参照するときはメソッド名のみでよい）


