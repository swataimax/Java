package lesson42;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * ストリームの種類
 */
public class Sample42_3 {

	public static void main(String[] args) {
		// IntStreamからStreamへ変換
		IntStream a = IntStream.of(2, 1, 3); // ストリームを生成
//		a.forEach(x -> System.out.println(x));
		
		Stream<Integer> b = a.boxed();
		b.forEach(x -> System.out.println(x)); // ラムダ式
//	    b.forEach(System.out::println);    		// メソッド参照
		
		// StreamからIntStreamへ変換
		List<Integer> list = List.of(20, 10, 30);
		Stream<Integer> s = list.stream();
		IntStream is = s.mapToInt(c -> c);
		
		is.forEach(System.out::println);
		
		
		
		System.out.println("-----");
		
		IntStream s11 = IntStream.of(2, 1, 3);
		Stream<Integer> s12 = s11.boxed();
		s12.forEach(i -> System.out.print(i + " "));
		
		System.out.println();
		
		IntStream s13 = IntStream.of(2, 1, 3);
		Stream<Integer> s14 = s13.mapToObj(e -> e);
		s14.forEach(i -> System.out.print(i + " "));
		
		System.out.println();
		
		
		Stream<Integer> s21 = List.of(2, 1, 3).stream();
		IntStream s22 = s21.mapToInt(e -> e);
		s22.forEach(i -> System.out.print(i + " "));
		
		
	}

}

/*
 * ・IntStreamとStream<Integer>の変換
 * 
 * IntStream → Stream<Integer>
 * s1        → s1.boxed()
 *              s1.mapToObj(e -> e)
 * 
 * 
 * Stream<Integer> → IntStream
 * s2              → s2.mapToInt(c -> c)
 * 
 * 
 */


