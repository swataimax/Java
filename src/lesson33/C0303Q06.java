package lesson33;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

public class C0303Q06 {
	public static void main(String[] args) throws IOException {
		Path srcPath = Path.of("C:\\java\\sampleFiles.txt");
		Path dstPath = Path.of("C:\\java\\sampleOutputFiles.txt");
		Charset cs = Charset.forName("UTF-8");
		try (BufferedReader br = Files.newBufferedReader(srcPath, cs);
				BufferedWriter bw = Files.newBufferedWriter(dstPath, cs)) {
			String line;
			while ((line = br.readLine()) != null) {
				// カンマで分割
				String[] arr = line.split(",");
				
//				String no = "";
//				String name = "";
//				String prefectures = "";
//
//				for (int i = 0; i < arr.length; i++) {
//					if (i == 0) {
//						no = arr[i];
//					} else if (i == 1) {
//						name = arr[i] + "さん";
//					} else {
//						prefectures = arr[i];
//					}
//				}
//
//				// カンマで連結
//				String newLine = String.join(",", no, name, prefectures);
				
				String newLine = String.join(",", arr[0], arr[1] + "さん", arr[2]);
//				System.out.println(newLine);
				
				bw.write(newLine);
				bw.newLine();
			}
		}
		System.out.println("処理終了");
	}
}
