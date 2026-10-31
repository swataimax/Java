package lesson43;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 * Optional
 */
public class Sample43_21 {
	public static void main(String[] args) {
		
		// リストの最大値は100未満
		List<Integer> words = Arrays.asList(1, 2, 3, 4, 6);
		
		words.stream()
				.max(Comparator.naturalOrder())
				.filter(x -> x > 100)
				.ifPresent(x -> System.out.println("最大値１= " + x));
				// ifPresentは、値が取得できる場合に中の処理を実行（取得できなければ中の処理を実行しない）
		
		Integer max = words.stream()
				.max(Comparator.naturalOrder())
				.filter(x -> x > 100)
				.orElse(100);	// 値が取得できない場合はデフォルトの値を使う
		System.out.println("最大値２= " + max);
		
	}
}

//最大値２= 100
// ↑リストの最大値が100未満のため、最大値１は出力されてない

