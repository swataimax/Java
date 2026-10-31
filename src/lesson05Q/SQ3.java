package lesson05Q;

public class SQ3 {

	public static void main(String[] args) {
		int x = 1;
		for (int i = 1; i <= 8; i++) {
//			System.out.print((x *= i) + " ");
			x *= i;
			System.out.print(x + " ");
		}

	}

}
