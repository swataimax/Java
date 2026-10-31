package lesson43;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/*
 * 統計処理
 * counting, maxBy, minBy
 */
public class Sample43_9 {
	public static void main(String[] args) {
		// 要素数が10、最小値が0、最大値が99の整数のリスト
		List<Integer> list = new Random().ints(10, 0, 100)
				.boxed()
				.collect(Collectors.toList());
		System.out.println(list);
		
		// 要素数
		Long count = list.stream().collect(Collectors.counting());
		System.out.println(count);
		
		// 最大値
		Integer max = list.stream()
				.collect(Collectors.maxBy(Integer::compare)).get();	// getでOptionalから取り出し
		System.out.println(max);
		
		// 最小値
		Integer min = list.stream()
				.collect(Collectors.minBy(Integer::compare)).get();	// getでOptionalから取り出し
		System.out.println(min);
	}
}
