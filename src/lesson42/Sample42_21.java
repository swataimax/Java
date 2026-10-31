package lesson42;

import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * boxed
 */
public class Sample42_21 {
	public static void main(String[] args) {
		Consumer<Integer> c = i -> System.out.print(i + " ");
		Stream<Integer> stream1 = IntStream.range(0, 5).mapToObj(e -> e);
		stream1.forEach(c);
		
		System.out.println();
		
		Stream<Integer> stream2 = IntStream.range(0, 5).boxed();
		stream2.forEach(c);
	}
}
