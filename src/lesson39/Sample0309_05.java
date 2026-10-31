package lesson39;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Sample0309_05 {
	public static void main(String[] args) {
		String path = "C:\\java\\Sample0309_05.txt";
		try (BufferedReader br = new BufferedReader(
				new FileReader(path))) {
			Map<String, Integer> map = new HashMap<>();
			String line;
			while ((line = br.readLine()) != null) {
				String[] strArr = line.split(","); // カンマで分割
				String shopName = strArr[0]; // 店舗名
				String salesAmount = strArr[1]; // 売上額
				if (map.get(shopName) == null) {
					map.put(shopName,
							Integer.parseInt(salesAmount));
				} else {
					int sum = map.get(shopName) +
							Integer.parseInt(salesAmount);
					map.put(shopName, sum);
				}
			}

			System.out.println(map);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
