package lesson34;

import java.util.ArrayList;
import java.util.List;

public class C0304Q01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("東京");
		list.add("神奈川");
		list.add("埼玉");
		list.add("千葉");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		for (String s : list) {
			System.out.println(s);
		}

	}
}
