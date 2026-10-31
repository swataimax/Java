package lesson34;

import java.util.List;

public class C0304Q03 {
	public static void main(String[] args) {
		List<Integer> list = List.of(30, 20, 50, 10, 40);
		int max = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (max < list.get(i)) {
				max = list.get(i);
			}
		}
		System.out.println("最大値：" + max);
	}
}
