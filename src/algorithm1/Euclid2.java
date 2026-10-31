package algorithm1;

public class Euclid2 {
	public static void main(String[] args) {
		int m = 1071, n = 1029;
		System.out.println("最大公約数：" + gcd(m, n));
		System.out.println("最大公約数：" + gcd2(m, n));
		System.out.println("最大公約数：" + gcd3(m, n));
	}

	static int gcd(int m, int n) {
		if (n == 0) {
			return m;
		} else {
			return gcd(n, m % n);
		}
	}
	
	
	static int gcd2(int m, int n) {
		if (n == 0) {
			return m;
		} else {
			int r = m % n;
			m = n;
			n = r;
			return gcd2(m, n);
		}
	}
	
	static int gcd3(int m, int n) {
		int r = m % n;
		if (r == 0) {
			return n;
		} else {
			m = n;
			n = r;
			return gcd3(m, n);
		}
	}
	
	
}
