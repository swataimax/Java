package lesson43;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * マッピング
 */
public class Sample43_4 {
	public static void main(String[] args) {
		// 単語のリストから単語長のリストを生成
		List<String> words = Arrays.asList(
				"blue", "green",
				"magenta", "red", "yellow");
		System.out.println(words);
		
		List<Integer> list = words.stream()
				.map(w -> w.length())
				.collect(Collectors.toList());
		
		System.out.println(list);
		
		List<Integer> list2 = words.stream()
				.collect(Collectors.mapping(
						w -> w.length(),
						Collectors.toList()));
		System.out.println(list2);
	}
}