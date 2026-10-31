package lesson43;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * グループ化
 */
public class Sample43_6 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList(
//				"a", "abc", "g", "ghi", "d");
				"a", "abc", "d", "g", "ghi");
		Map<String, List<String>> map = words.stream()
				.collect(Collectors.groupingBy(w -> w.substring(0, 1)));
		System.out.println(map);

		Map<String, Long> map2 = words.stream()
				.collect(Collectors.groupingBy(w -> w.substring(0, 1),
						Collectors.counting()));
		System.out.println(map2);
		
		Map<String, Long> map3 = words.stream()
				.collect(Collectors.groupingBy(w -> w.substring(0, 1),
						() -> new LinkedHashMap<>(),	// ラムダ式
						Collectors.counting()));
		System.out.println(map3);
		
		Map<String, Long> map4 = words.stream()
				.collect(Collectors.groupingBy(w -> w.substring(0, 1),
						LinkedHashMap::new,				// コンストラクタ参照
						Collectors.counting()));
		System.out.println(map4);
		
		// partitioningBy
		Map<Boolean, List<String>> map5 = words.stream()
				.collect(Collectors.partitioningBy(w -> w.length() > 2));
		System.out.println(map5);
		
		// groupingByで書いても同じ
		Map<Boolean, List<String>> map6 = words.stream()
				.collect(Collectors.groupingBy(w -> w.length() > 2));
		System.out.println(map6);
		
		
		
		Map<Integer, List<String>> map7 = words.stream()
				.collect(Collectors.groupingBy(w -> w.length()));
		System.out.println(map7);
		
		
	}
}
