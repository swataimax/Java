package lesson43;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * リデュース
 */
public class Sample43_5 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList(
				"blue", "green",
				"magenta", "red", "yellow");
		
		int total = words.stream()
				.map(w -> w.length())
//				.peek(x -> System.out.println(x))
				.reduce(0, (n, s) -> n + s);
		System.out.println(total);
		
		int total2 = words.stream()
				.map(w -> w.length())
				.collect(Collectors.reducing(0, (n, s) -> n + s));
		System.out.println(total2);
		
		
		
		
		System.out.println(
				words.stream()
				.map(w -> w.length())
//				.peek(x -> System.out.println(x))
				.reduce(0, (n, s) -> n + s)
				);
		

	}
}