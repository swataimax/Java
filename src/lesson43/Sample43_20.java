package lesson43;

import java.util.Arrays;
import java.util.List;

/*
 * Optional
 */
public class Sample43_20 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList(
				"blue", "green", "magenta", "red", "yellow");
		
		words.stream()
				.filter(w -> w.startsWith("m"))
				.findFirst()
				.ifPresent(w -> System.out.println("m:" + w));
		
		words.stream()
				.filter(w -> w.startsWith("x"))
				.findFirst()
				.ifPresent(w -> System.out.println("x:" + w));
	}
}