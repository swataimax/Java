package lesson03b;

public class ReviewTest8_1 {

	public static void main(String[] args) {
		int x = 0;
		int sum = switch(x) {
		case 1 -> x = x + 1;
		case 2 -> x = x + 2;
		default -> {
			yield x = x + 4;
			}
		};
		System.out.println(sum);
	}

}
