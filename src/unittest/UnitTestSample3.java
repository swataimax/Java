package unittest;

public class UnitTestSample3 {

	// 引数1と引数2を足した結果を返却する
	public int sum(int a, int b) {
		return a + b;
	}

	// 引数strが空か判定
	public boolean isBlank(String str) {
		if ("".equals(str) || str == null) {
			return true;
		} else {
			return false;
		}
		// 以下の記述でも可、上記プログラムはカバレッジを見やすくするためのもの
		// return "".equals(str) || str == null;
	}

	// 1から引数の値までの合計値を返却する
	public int calc(int x) {
		int sum = 0;
		for (int i = 1; i <= x; i++) {
			sum += i;
		}
		return sum;
	}

	// パターン検証用
	public boolean judge(int a, int b, int c) {
		boolean flg = false;
		if (a > 0) {
			if (b > 0) {
				flg = true;
			}
		} else { // a <= 0の場合
			if (c <= 0) {
				flg = true;
			}
		}
		return flg;
	}
	
	

}
