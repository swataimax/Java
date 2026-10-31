package lesson43;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * （参考）toArray
 */
public class Sample43_17 {
	public static void main(String[] args) {
		int[] nums = IntStream.range(0, 10).toArray();
		
		Object[] arr1 = Stream.of("a", "b").toArray();
		
		String[] arr2 = Stream.of("p", "q")
//				.peek(x -> System.out.println(x))
				.toArray(i -> new String[i]);
		
		String[] arr3 = Stream.of("x", "y")
				.toArray(String[]::new);	// コンストラクタ参照
		
//		String[] arr3 = Stream.of("x", "y").toArray(i -> new String[i]);
		
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		
		
		
		String[] arrX = Stream.of("p", "q")
				.peek(x -> System.out.println(x))
//				.toArray(i -> new String[i]);
				.toArray(x -> new String[x]);
		
		Stream.of("p", "q").toArray(i -> new String[i]);
		
		// i はストリームの要素数で、new String[i] によりそのサイズの String[] を作成
		// String[]::new は 配列コンストラクタ参照（ラムダ式）
		
		
		
	}
}
