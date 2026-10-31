package lesson42;

import java.util.stream.IntStream;

public class C42Q6 {
	public static void main(String[] args) {
		IntStream.rangeClosed(1, 100)
				.forEach(s -> {
					if (s % 3 == 0 && s % 5 == 0) {
						System.out.println("FizzBuzz");
					} else if (s % 3 == 0) {
						System.out.println("Fizz");
					} else if (s % 5 == 0) {
						System.out.println("Buzz");
					} else {
						System.out.println(s);
					}
				});

		System.out.println("---");

		IntStream.rangeClosed(1, 100)
				.mapToObj(
						x -> x % 3 == 0 && x % 5 == 0 ? "FizzBuzz" : x % 3 == 0 ? "Fizz" : x % 5 == 0 ? "Buzz" : x)
				.forEach(System.out::println);

		System.out.println("---");

		IntStream.range(1, 101)
				.forEach(i -> System.out.println(
						(i % 3 == 0 ? "Fizz" : "")
								+ (i % 5 == 0 ? "Buzz" : i % 3 == 0 ? "" : i)));
	}
}
