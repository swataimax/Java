package lesson34;

import java.util.List;

public class C0304Q02 {
	public static void main(String[] args) {
		List<Integer> list = List.of(10, 20, 30, 40, 50);
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println("合計:" + sum);
		System.out.println("平均:" + (double) sum / list.size());
	}
}
