package lesson05;

public class Sample05_08b {
	public static void main(String[] args) {
		
//		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			int sum = 0;
//			sum = 0;
			sum += i;
			System.out.println("合計は" + sum);
			// スコープの都合上、for文の中に移動している
		}
//		System.out.println("合計は" + sum);
	}
}
