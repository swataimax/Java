package lesson34;

import java.util.ArrayList;
import java.util.List;

public class Sample0304_02 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 5; i++) {
			list.add(i);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		for (int i : list) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println(list);
		list.set(0, 10);
		System.out.println(list.get(0));
		System.out.println(list);

		List<String> list2 = List.of("abc", "def", "ghi");
		System.out.println(list2);
		// UnsupportedOperationExceptionが発生する
		//list2.set(0, "xyz"); // 変更不可能なリスト
	}
}
