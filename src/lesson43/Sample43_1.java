package lesson43;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * reduce
 */
public class Sample43_1 {
	public static void main(String[] args) {
		int sum = IntStream.rangeClosed(1, 100)
				.reduce(0, (p, n) -> p + n);
		System.out.println(sum); // 1から100までの合計値
		
		String text = Stream.of("Hello ", "World")
				.reduce("", (n, s) -> n + s);
		System.out.println(text);
		
		Optional<String> opt = Stream.of("Hello ", "World")
				.reduce((p, s) -> p + s);
		System.out.println(opt.get());
		
	}
}