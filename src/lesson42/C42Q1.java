package lesson42;

import java.util.Arrays;
import java.util.List;

public class C42Q1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("山田", "佐藤", "田中", "加藤", "本田");

		for (String str : list) {
			if (str.contains("田")) {
				System.out.println(str);
			}
		}
		
		System.out.println("---");
		
		// StreamAPIを使用したコード
		list.stream()
				.filter(str -> str.contains("田"))
				.forEach(System.out::println);
	}
}
