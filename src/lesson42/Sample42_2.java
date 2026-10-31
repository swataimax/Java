package lesson42;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*
 * Collectionのストリーム
 */
public class Sample42_2 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList(
				"blue", "cyan", "gray", "green", "magenta",
				"orange", "pink", "red", "white", "yellow");
		System.out.println(words);
		
		List<String> longWords = words
				.stream() // ストリーム生成
				.filter(w -> w.length() >= 5) // 中間操作(長さ5以上を選択)
				.collect(Collectors.toList()); // 終端操作(Listに格納)
		System.out.println(longWords);
		
		
		// ばらばらに書ける
		Stream<String> stream1 = words.stream();  // ストリーム生成
		Stream<String> stream2 = stream1.filter(w -> w.length() >= 5);  // 中間操作
		List<String> words2 = stream2.collect(Collectors.toList()); // 終端操作
		System.out.println(words2);
		
		
		// 条件を2つつけてみる
		List<String> longWords2 = words
				.stream() // ストリーム生成
				.filter(w -> w.length() >= 5) // 中間操作(長さ5以上を選択)
				.filter(w -> w.length() <= 6) // 中間操作(長さ6以下を選択)
				.collect(Collectors.toList()); // 終端操作(Listに格納)
		System.out.println(longWords2);
		
		Object[] longWords3 = words
				.stream() // ストリーム生成
				.filter(w -> w.length() >= 5) // 中間操作(長さ5以上を選択)
				.filter(w -> w.length() <= 6) // 中間操作(長さ6以下を選択)
				.toArray(); // 終端操作(Listに格納)
		System.out.println(longWords3);
		System.out.println(longWords3.getClass());
		
		

	}
}
