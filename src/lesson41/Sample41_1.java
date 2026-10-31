package lesson41;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sample41_1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		System.out.println("ソート前：" + list);
		Collections.sort(list);
		System.out.println("ソート後：" + list);
	}

}
