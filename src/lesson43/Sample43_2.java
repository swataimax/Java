package lesson43;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * リスト化
 * collect
 */
public class Sample43_2 {
	public static void main(String[] args) {
		List<Integer> list = IntStream.range(0, 10)
				.boxed()
				.collect(Collectors.toList());
		System.out.println(list);
		
//		Path path = Paths.get("C:¥¥pleiades¥¥eclipse¥¥eclipse.ini");
		Path path = Paths.get("C:\\java\\Sample.java");
		try (Stream<String> stream = Files.lines(path)) {
			List<String> words = stream
					.map(String::toUpperCase)
					.collect(Collectors.toList());
			words.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
