package lesson33;

import java.io.File;

public class C0303Q01 {
	public static void main(String[] args) {
		File file = new File("C:\\java\\SampleBwCopy.java");
		System.out.println("絶対パス：" + file.getAbsolutePath());
		System.out.println("ファイル名：" + file.getName());
		System.out.println("ファイルサイズ：" + file.length());
	}
}
