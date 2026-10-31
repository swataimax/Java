package lesson42;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*
 * filter
 */
public class Sample42_13 {
	public static void main(String[] args) {
		IntStream st = IntStream.range(0, 10).filter(i -> i % 2 == 0);
		st.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		
		List<String> list = Arrays.asList(
				"blue", "cyan", "gray", "green", "magenta",
				"orange", "pink", "red", "white", "yellow");
		list.stream().filter(s -> s.length() >= 5)
				.forEach(System.out::println);
	}
}
