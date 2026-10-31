package lesson33;

import java.nio.file.Path;

public class Sample0303_12 {
	public static void main(String[] args) {
		Path path = Path.of("C:\\java\\Sample.java");
		// C:\java　←ここの「java」という名称(フォルダー名)を取得
		System.out.println("getName(0)：" + path.getName(0));
		// C:\java\Sample.java　のファイル名を取得
		System.out.println("getName(1)：" + path.getName(1));
		// 絶対パス
		System.out.println("toAbsolutePath()：" + path.toAbsolutePath());
		// ファイル名
		System.out.println("getFileName()：" + path.getFileName());
		// 親ディレクトリパス
		System.out.println("getParent()：" + path.getParent());
	}
}
