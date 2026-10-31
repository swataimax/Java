package lesson03b;

public class ReviewTest8_2 {

	public static void main(String[] args) {
		int x = 0;
		int sum = switch(x) {
		case 1 -> x = x + 1;
		case 2, 3 -> x = x + 2;
		case 4, 5 -> x = x + 4;
		default -> x = x + 6;		// defaultがないとコンパイルエラー
		};
		System.out.println(sum);
		
	}

}
