package lesson34;

import java.util.HashMap;
import java.util.Map;

public class C0304Q06 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "リンゴ");
		map.put(2, "みかん");
		map.put(3, "バナナ");
		map.put(4, "メロン");
		map.put(5, "いちご");

		for (int i = 1; i <= 5; i++) {
			System.out.println(map.get(i));
		}
	}
}
