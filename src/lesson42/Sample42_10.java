package lesson42;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * （参考）ファイルシステム
 */
public class Sample42_10 {
	public static void main(String[] args) {
		Path path = Paths.get(".");			// カレントディレクトリ
		try {
			// 指定したディレクトリ内の一覧を表示
			Files.list(path).forEach(System.out::println);
			
			System.out.println();
			
			// 指定したディレクトリ内の一覧をサブディレクトリ含めて表示
			Files.walk(path).forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
