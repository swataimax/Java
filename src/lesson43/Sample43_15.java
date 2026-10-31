package lesson43;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
 * （参考）findFirst, findAny
 */
public class Sample43_15 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("bbb", "aaa", "abc");
		Optional<String> optional = words.stream()
				.filter(w -> w.startsWith("a"))
				.findFirst();
		System.out.println(optional.get());
	}
}
