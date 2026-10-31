package lesson34;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ex0304_03 {
	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("あいう", 1);
		hashMap.put("かきく", 2);
		hashMap.put("さしす", 3);
		hashMap.put("たちつ", 4);
		hashMap.put("たちつ", 4);
		hashMap.put("なにぬ", 5);
		System.out.println("hashMap" + hashMap);

		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("かきく", 2);
		linkedHashMap.put("あいう", 1);
		linkedHashMap.put("さしす", 3);
		linkedHashMap.put("たちつ", 4);
		linkedHashMap.put("たちつ", 4);
		linkedHashMap.put("なにぬ", 5);
		System.out.println("linkedHashMap" + linkedHashMap);

		Map<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("なにぬ", 5);
		treeMap.put("たちつ", 4);
		treeMap.put("たちつ", 4);
		treeMap.put("さしす", 3);
		treeMap.put("かきく", 2);
		treeMap.put("あいう", 1);
		System.out.println("treeMap" + treeMap);
	}
}
