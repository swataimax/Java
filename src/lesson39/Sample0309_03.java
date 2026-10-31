package lesson39;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Sample0309_03 {
	public static void main(String[] args) {
//		String path = "C:\\java\\Sample0309_03a.txt";
		// 読み込むファイルを切り替えて実施してみよう
		String path = "C:\\java\\Sample0309_03b.txt";
		List<List<String>> list = getList(path);
		System.out.println(list);
	}

	// ファイルのデータを二次元リストに変換する
	static List<List<String>> getList(String path) {
		List<List<String>> list = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(
				new FileReader(path));) {
			String line;
			for (; (line = br.readLine()) != null;) {
				String[] strArr = line.split(","); // カンマで分割する
				List<String> list2 = new ArrayList<>();
				// 1行の1項目単位で要素に追加する
				for (String str : strArr) {
					list2.add(str); // 「1」「山田」「東京」等の項目が追加される
				}
				list.add(list2); // 「1,山田,東京」等の1行が追加される
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
}
