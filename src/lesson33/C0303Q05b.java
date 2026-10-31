package lesson33;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class C0303Q05b {
	public static void main(String[] args) throws IOException {
		Path path = Path.of("C:\\java\\sampleFiles.txt");
		List<String> lines = Files.readAllLines(path, Charset.forName("UTF-8"));

		for (String line : lines) {
			System.out.println(line);
		}
	}
}
