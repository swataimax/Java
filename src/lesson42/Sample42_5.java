package lesson42;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/*
 * 	IOから生成
 */
public class Sample42_5 {
	public static void main(String[] args) {
//		String file = "C:\\pleiades\\eclipse\¥eclipse.ini";
		String file = "C:\\pleiades\\eclipse\\eclipse.ini";
//		String file = "C:\\java\\Sample.java";
//		String file = "C:\\Sample.java";
		System.out.println(file);
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			Stream<String> stream = br.lines();		// linesメソッドはクローズ処理が必要
			stream.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(); // 改行
		
		Path path = Paths.get(file);
		try (Stream<String> stream = Files.lines(path)) {
			stream.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
