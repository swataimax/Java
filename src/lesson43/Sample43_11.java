package lesson43;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 統計処理
 * summarizingXXX
 */
public class Sample43_11 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("blue", "green", "magenta",
				"red", "yellow");

		IntSummaryStatistics iss = list.stream()
				.collect(Collectors.summarizingInt(w -> w.length()));
		// 単語の長さの合計を求める
		System.out.println(iss.getSum());
		// 単語の長さの平均を求める
		System.out.println(iss.getAverage());
	}
}