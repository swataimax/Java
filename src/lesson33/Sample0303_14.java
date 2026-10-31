package lesson33;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

public class Sample0303_14 {
	public static void main(String[] args) throws IOException {
		Path path1 = Path.of("C:\\java\\Sample.java");
		Path path2 = Path.of("C:\\java\\SampleCopyFiles.java");
		try (BufferedReader br = Files.newBufferedReader(
				path1, Charset.forName("UTF-8"));
				BufferedWriter bw = Files.newBufferedWriter(
						path2, Charset.forName("UTF-8"))) {
			String line;
			while ((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
			}
			System.out.println("処理終了");
		}
	}
}
