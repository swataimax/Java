package lesson33;

import java.io.File;

public class C0303Q02 {
	public static void main(String[] args) {
		File file = new File("C:\\java");
		for (String str : file.list()) {
			System.out.println(str);
		}
	}
}
