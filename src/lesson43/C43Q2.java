package lesson43;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class C43Q2 {
	public static void main(String[] args) {
		// 1から100までの値を要素に持つリストを作成
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			list.add(i);
		}
		System.out.println(list); // リストの中身を確認
		List<Integer> resultList = list.stream().filter(x -> x % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(resultList);//リストの中身を確認
	}
}
