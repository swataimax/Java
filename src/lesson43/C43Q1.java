package lesson43;

import java.util.stream.IntStream;

public class C43Q1 {
	public static void main(String[] args) {
		int sum = IntStream.rangeClosed(1, 100)
				.filter(x -> x % 2 == 1)
				.reduce(0, (p, n) -> p + n);
		System.out.println(sum);
	}
}