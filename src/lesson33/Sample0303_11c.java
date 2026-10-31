package lesson33;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample0303_11c {
	public static void main(String[] args) throws IOException {
		String path = "C:\\java\\charset.txt";
		// 文字コードにUTF-8を明示的に指定
		try (InputStreamReader isr = new InputStreamReader(
				new FileInputStream(path), "UTF-8")) {
			for (int c; (c = isr.read()) != -1;) {
				System.out.print((char) c);
			}
		}
	}
}
