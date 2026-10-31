package lesson34;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Sample0304_08 {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("東京", 100);
		map.put("神奈川", 200);
		map.put("埼玉", 300);
		map.put("千葉", 400);

		// エントリ(キーと値の組み合わせ)をSetビューで取得        
		Set<Map.Entry<String, Integer>> me = map.entrySet();

		// Setビューの要素であるMap.Entryを取り出しながらループ処理
		for (Map.Entry<String, Integer> m : me) {
			String s = m.getKey();
			int i = m.getValue();
//			System.out.println("キー：" + i + ", " + "値:" + s);
			System.out.println("キー：" + s + ", " + "値:" + i);
		}
	}
}
