package lesson42;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * iterate, generate, concatメソッド
 * 
 * 
 */
public class Sample42_8 {
	public static void main(String[] args) {
		// 0から9までの要素を持つストリームを生成
		IntStream stream1 = IntStream.iterate(0, n -> n + 1).limit(10L);
		stream1.forEach(i -> System.out.print(i + " "));
		
		System.out.println();
		
		// 「x」5つを要素としてもつストリームを生成
		Stream<String> stream2 = Stream.generate(() -> "x").limit(5L);
		stream2.forEach(s -> System.out.print(s + " "));
		
		System.out.println();
		
		// ストリームを連結
		Stream<Integer> stream3 = Stream.of(1, 2, 3);
		Stream<Double> stream4 = Stream.of(0.1, 0.2, 0.3);
		Stream<Number> stream5 = Stream.concat(stream3, stream4);
		stream5.forEach(s -> System.out.print(s + " "));
	}
}


