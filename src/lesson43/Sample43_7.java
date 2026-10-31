package lesson43;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * マップ化
 */
public class Sample43_7 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("abc", "def", "ghi");
		Map<String, String> map = words.stream()
				.collect(Collectors.toMap(w -> w, w -> w.toUpperCase()));
		System.out.println(map);
		
		List<String> words2 = Arrays.asList("abc", "abc", "ghi");
		Map<String, String> map2 = words2.stream()
				.collect(Collectors.toMap(w -> w,
						w -> w.toUpperCase(),
						(s, a) -> s + "," + a));
		System.out.println(map2);
		
		
		
		List<String> words3 = Arrays.asList("abc", "abc", "ghi");
		Map<String, String> map3 = words3.stream()
				.collect(Collectors.toMap(w -> w,
						w -> w.toUpperCase(),
						(s, a) -> s));
		System.out.println(map3);
		
	}
}

//{abc=ABC, def=DEF, ghi=GHI}
//{abc=ABC,ABC, ghi=GHI}
// ↑abcが重複しているので「ABC」が2つになっている



