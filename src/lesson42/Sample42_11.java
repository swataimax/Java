package lesson42;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * （参考）ファイルシステム
 */
public class Sample42_11 {
	public static void main(String[] args) {
		Path path = Paths.get(".");
		try {
			// 拡張子が「.java」のファイルを出力
			Files.find(path, 10, (p, attr) -> p.toString().endsWith(".java"))
					.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

/*
 * ディレクトリ「C:¥¥java」から深さ10までの探索を行い、
 * 拡張子が「.txt」で終わるファイル名のみ出力
 */
