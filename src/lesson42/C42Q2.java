package lesson42;

import java.util.stream.IntStream;

public class C42Q2 {
	public static void main(String[] args) {
		IntStream.iterate(11, x -> x + 2)
				.limit(5L)
				.forEach(x -> System.out.print(x + " "));
		
		System.out.println();
		
		IntStream.rangeClosed(11, 100)
				.filter(i -> i % 2 == 1)
				.limit(5L)
				.forEach(x -> System.out.print(x + " "));
		
		System.out.println();
		
		IntStream.iterate(11, x -> x+1)
				.filter(i -> i % 2 == 1)
				.limit(5L)
				.forEach(x -> System.out.print(x + " "));
		
	}
}