package lesson43;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 統計処理
 * summingXXX,averagingXXX
 */
public class Sample43_10 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"blue", "green", "magenta", "red", "yellow", "gold");
		
		// 単語の長さの合計(文字数の合計)を求める
		Integer total = list.stream()
				.collect(Collectors.summingInt(w -> w.length()));
		System.out.println(total);
		
		// 単語の長さの平均(文字数の平均)を求める
		Double average = list.stream()
				.collect(Collectors.averagingDouble(w -> w.length()));
		System.out.println(average);
	}
}