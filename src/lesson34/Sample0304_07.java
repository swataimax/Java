package lesson34;

import java.util.HashMap;
import java.util.Map;

public class Sample0304_07 {
	public static void main(String[] args) {

		// 頻度を数える検索対象文字列
		String str = "Integer,Double,Character";
		Map<Character, Integer> map = new HashMap<>();
		// 検索対象文字列を1文字ずつ処理していく
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i); // 1文字ずつ取得
			// Mapに対象文字が格納されていない場合
			if (map.get(c) == null) {
				// 登場回数を1としてMapに格納
				map.put(c, 1);
			} else {
				// 今まで登場した回数に+1してMapに格納
				map.put(c, map.get(c) + 1);
			}
		}
		System.out.println(map);
	}
}
