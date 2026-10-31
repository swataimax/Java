package algorithm1;

public class RecursiveCall {

	public static void main(String[] args) {
		System.out.println("1から100までの合計：" + calc(100));
		System.out.println("1から100までの合計：" + calc1(100));
		System.out.println("1から100までの合計：" + calc2(100));
	}

	static int calc(int n) {
		if (n == 1) {
			return 1;
		} else {
			return calc(n - 1) + n;
		}
	}
	
	// 再帰呼び出しを使わずに
	static int calc1(int n) {
		int sum = 0;
		int i = 1;
		while (true) {
			sum += i;
			if (i == n) {
				return sum;
			}
			i++;
		}
	}
	
	// 再帰呼び出しを使わずに
	static int calc2(int n) {
		int sum = 0;
		int i = n;
		while (true) {
			sum += i;
			if (i == 0) {
				return sum;
			}
			i--;
		}
	}
	
}
