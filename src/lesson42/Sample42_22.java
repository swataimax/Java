package lesson42;

import java.util.stream.IntStream;

/*
 * asXXXStream
 */
public class Sample42_22 {
	public static void main(String[] args) {
		IntStream.range(0, 10)
				.asDoubleStream()
				.forEach(d -> System.out.println(d));
	}
}
