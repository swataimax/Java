package lesson42;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * mapToXXX
 */
public class Sample42_15 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("blue", "green", "magenta", "red", "yellow");

		// StringのSteramを生成して単語の長さのIntStreamに変換
		IntStream is1 = list.stream()
				.mapToInt(word -> word.length());
		is1.forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		// IntStreamをStringのStreamに変換
		IntStream is2 = list.stream()
				.mapToInt(word -> word.length());
		Stream<String> ss = is2.mapToObj(Integer::toString);
		ss.forEach(s -> System.out.print(s + " "));
		System.out.println();

		// IntStreamをIntegerのStreamに変換し、更にIntStreamに変換
		Stream<Integer> si = IntStream.of(1, 2, 3).mapToObj(e -> e);
		IntStream is3 = si.mapToInt(e -> e);
		System.out.println(is3.sum()); // 合計を表示
	}
}




/*
 * メソッド		: 変換前のストリーム				→ 変換後のストリーム
 * map 			: Stream 							→ Stream		（StreamをStreamに変換）
 * mapToInt 	: Stream,LongStream,DoubleStream 	→ IntStream	（IntStream以外をIntStreamに変換）
 * mapToLong 	: Stream,IntStream,DoubleStream  	→ LongStream	（LongStream以外をLongStreamに変換）
 * mapToDouble	: Stream,IntStream,LongStream    	→ DoubleStream	（DoubleStream以外をDoubleStreamに変換）
 * mapToObj		: IntStream,LongStream,DoubleStream → Stream		（Stream以外をStreamに変換）
 * 
 * boxed		: IntStream							→ Stream<Integer>
 * 				  LongStream						→ Stream<Long>
 * 				  DoubleStream						→ Stream<Double>
 * 
 * asLongStream	: IntStream							→ LongStream
 * asDoubleStream:IntStream,LongStream				→ DoubleSteram
 * 
 * 
 */



