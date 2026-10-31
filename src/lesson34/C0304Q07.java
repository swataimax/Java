package lesson34;

import java.util.HashMap;
import java.util.Map;

public class C0304Q07 {
	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("東京", "001");
		map.put("神奈川", "002");
		map.put("埼玉", "003");
		map.put("千葉", "004");
		map.put(null, null);
		map.put("東京", "005");

		for (String key : map.keySet()) {
			// key.equals("東京")と記述すると実行時例外が発生する
			if ("東京".equals(key)) {
				System.out.println(map.get(key));
			}
		}
		
//		System.out.println(map);
	}
}
