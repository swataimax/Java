package lesson42;

import java.util.Arrays;
import java.util.List;

public class C42Q5 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"January", "February", "March", "April", "May", "June", "July", 
				"August","September", "October", "November", "December");

		// sortedとmapはどちらを先に記述してもよい
		list.stream()
				.filter(s -> s.length() <= 5)
				.sorted()
				.map(s -> "[" + s + "]")
				.forEach(System.out::println);
		
		System.out.println("---");
		
		list.stream()
				.filter(s -> s.length() <= 5)
				.sorted()
				.forEach(s -> System.out.println("[" + s + "]"));
	}
}
