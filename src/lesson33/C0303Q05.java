package lesson33;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

public class C0303Q05 {
	public static void main(String[] args) throws IOException {
		Path path = Path.of("C:\\java\\sampleFiles.txt");
		try (BufferedReader br = Files.newBufferedReader(path, Charset.forName("UTF-8"))) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}
	}
}
