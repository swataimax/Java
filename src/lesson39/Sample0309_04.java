package lesson39;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class Sample0309_04 {
	public static void main(String[] args) {
		String path1 = "C:\\java\\Sample0309_04a.txt";
		String path2 = "C:\\java\\Sample0309_04b.txt";

		try (BufferedReader br1 = new BufferedReader(
				new FileReader(path1));
				BufferedReader br2 = new BufferedReader(
						new FileReader(path2));) {
			// 昇順に並べるためTreeSetを使用する
			Set<String> set = new TreeSet<>();
			String line;
			while ((line = br1.readLine()) != null) {
				set.add(line); // Setにファイルデータを追加
			}
			while ((line = br2.readLine()) != null) {
				set.add(line); // Setにファイルデータを追加
			}
			System.out.println(set);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
