package lesson33;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Sample0303_15 {
	public static void main(String[] args) throws IOException {
		Path path1 = Path.of("C:\\java\\Sample.java");
		List<String> lines = Files.readAllLines(path1, Charset.forName("UTF-8"));
		for (String line : lines) {
			System.out.println(line);
		}
	}
}
