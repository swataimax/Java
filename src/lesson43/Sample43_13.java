package lesson43;

import java.util.List;
import java.util.stream.Collector;

/*
 * Collectorの実装クラス
 */
public class Sample43_13 {
	public static void main(String[] args) {
		Collector<String, StringBuilder, String> collector = 
				Collector.of(() -> new StringBuilder(),
							(b, s) -> b.append(s),
							(b1, b2) -> b1.append(b2),
							b -> b.toString());
		List<String> list = List.of("blue", "green", "magenta", "red", "yellow");
		String result = list.stream().collect(collector);
		System.out.println(result);
	}
}
