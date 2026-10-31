package algorithm1;
//アルゴリズムの例
//ユークリッドの互除法: 2つの正の整数の最大公約数を求めるアルゴリズム
public class Euclid {
	public static void main(String[] args) {
		int m = 1071, n = 1029;
		System.out.println("最大公約数：" + gcd(m, n));
	}
	
	static int gcd(int m, int n) {
		while (true) {
			int r = m % n;
			if (r == 0) {
				return n;
			}
			m = n;
			n = r;
		}
	}
	
}
