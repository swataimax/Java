package lesson43;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
/*
 * 文字列の連結
 */
public class Sample43_3 {
	public static void main(String[] args) {
		// str1にはABCが入る
		String str1 = Stream.of("A", "B", "C")
				.collect(Collectors.joining());
		System.out.println(str1);
		
		// str2には01234
		String str2 = IntStream.range(0, 5)
				.mapToObj(String::valueOf)
				.collect(Collectors.joining());
		System.out.println(str2);
		
		// str3には0,1,2,3,4が入る
		String str3 = IntStream.range(0, 5)
				.mapToObj(String::valueOf)
				.collect(Collectors.joining(","));
		System.out.println(str3);
		
		// str4には[0,1,2,3,4]が入る
		String str4 = IntStream.range(0, 5)
				.mapToObj(String::valueOf)
				.collect(Collectors.joining(",", "[", "]"));
		System.out.println(str4);
		
	}
}
