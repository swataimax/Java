package lesson41;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sample41_11 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3);
		
		// 降順に並び替え
		Collections.sort(list, (x, y) -> Integer.compare(y, x));
		
		for (Integer i : list) { // 拡張for文
			System.out.println(i);
		}
		
		// 昇順に並び替え
		Collections.sort(list, Integer::compare);
		
		// ラムダ式
		list.forEach(s -> System.out.println(s));
		// メソッド参照
		list.forEach(System.out::println);
	}

}
