package lesson42;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * map
 */
public class Sample42_14 {
	public static void main(String[] args) {
		IntStream stream1 = IntStream.of(0, 1, 2, 3, 4).map(i -> i * 2);
		stream1.forEach(i -> System.out.print(i + " "));
		System.out.println("¥n");

		String text = "Thank You";
		Stream<Integer> stream2 = Arrays.stream(text.split(" ")).map(s -> s.length());

		stream2.forEach(System.out::println);
		System.out.println();

		List<String> words = Arrays.asList("JAVA", "IS", "COOL");
		Stream<String> stream3 = words.stream()
				.filter(s -> s.length() > 3)
				.map(word -> word.toLowerCase());
		stream3.forEach(System.out::println);
	}
}
