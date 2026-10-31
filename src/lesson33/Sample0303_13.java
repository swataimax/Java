package lesson33;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Sample0303_13 {
	public static void main(String[] args) throws IOException {
		Path path1 = Path.of("C:\\java\\Sample.java"); // ファイル
		Path path2 = Path.of("C:\\java"); // ディレクトリ
		System.out.println("path1：" + Files.isDirectory(path1));
		System.out.println("path2：" + Files.isDirectory(path2));
		// ファイルサイズ
		System.out.println("size：" + Files.size(path1));
		// タイムスタンプ
		System.out.println("getLastModifiedTime："
				+ Files.getLastModifiedTime(path1));
		// ファイルコピー
		Path path3 = Path.of("C:\\java\\Sample2.java");
		System.out.println(Files.copy(path1, path3));
	}
}
