package lesson36;

public class C0306Q01 {
	public static void main(String[] args) {
		System.out.println(sum(1, 2, 3));
		System.out.println(sum(1, 2, 3, 4, 5));

	}

	static int sum(int... a) {
		int sum = 0;
		for (int b : a) {
			sum += b;
		}
		return sum;
	}
}
