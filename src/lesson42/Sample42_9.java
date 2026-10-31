package lesson42;

import java.util.Random;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

/*
 * （参考）乱数のストリーム
 */
public class Sample42_9 {
	public static void main(String[] args) {
		Random rnd = new Random();
		
//		IntConsumer ic = i -> System.out.println(i + " ");
		IntConsumer ic = i -> System.out.print(i + " ");

		// intの範囲の乱数を要素とするストリームを生成
		IntStream stream1 = rnd.ints();
		stream1.limit(3L).forEach(ic);
		System.out.println();
		
		// intの範囲の乱数を要素とする要素数5のストリームを生成
		IntStream stream2 = rnd.ints(5L);
		stream2.forEach(ic);
		System.out.println();
		
		// 0から999までの乱数を要素とするストリームを生成
		IntStream stream3 = rnd.ints(0, 1000);
		stream3.limit(5L).forEach(ic);
		System.out.println();
		
		// 0から999までの乱数を要素とする要素数10のストリームを生成
		IntStream stream4 = rnd.ints(10L, 0, 1000);
		stream4.forEach(ic);
		System.out.println();
	}
}
