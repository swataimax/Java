package lesson33;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class C0303Q04 {
	public static void main(String[] args) {
		String srcPath = "C:\\java\\sample.txt";
		String dstPath = "C:\\java\\sampleOutput.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(srcPath));
				BufferedWriter bw = new BufferedWriter(new FileWriter(dstPath))) {

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
		} catch (IOException e) {
			System.err.println(e);
		}
		System.out.println("処理終了");
	}
}
