package lesson41;

import java.util.Comparator;

public class Sample41_3 {

	public static void main(String[] args) {
		Comparator<Integer> cmp = (Integer x, Integer y) -> {
			return Integer.compare(x, y);
		};
		
		if (cmp.compare(10, 5) > 0) {
			System.out.println("OK");
		}
	}

}
