package lesson34;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Sample0304_06 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "東京");
		map.put(2, "神奈川");
		map.put(3, "埼玉");
		map.put(4, "千葉");

		String s = map.get(1);
		System.out.println(s);
		
		// Mapに格納したキー一覧取得
		Set<Integer> set = map.keySet();
		System.out.println(set);
		for (int key : set) {
			System.out.println(key);
		}

		// Mapに格納した値一覧取得
		Collection<String> col = map.values();
		System.out.println(col);
		for (String str : col) {
			System.out.println(str);
		}
	}
}
