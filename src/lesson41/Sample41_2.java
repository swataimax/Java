package lesson41;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sample41_2 {

	public static void main(String[] args) {
		
		Comparator<Integer> cmp = new Comparator<Integer>() {
			public int compare(Integer x, Integer y) {
				return Integer.compare(x, y);
			}
		};
		
		List<Integer> list = new ArrayList<>();
		list.add(80);
		list.add(70);
		list.add(50);
		list.add(20);
		list.add(60);
		list.add(90);
		Collections.sort(list, cmp);
		System.out.println(list);
	}

}
