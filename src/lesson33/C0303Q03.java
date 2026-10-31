package lesson33;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class C0303Q03 {
	public static void main(String[] args) {
		String path = "C:\\java\\sample.txt";
//		String path = "C:\\java\\sample2.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("エラー");
			System.err.println(e);			// コンソールに赤字で出力
			System.out.println(e);			// コンソールに出力
		}
		System.out.println("処理終了");
	}
}
