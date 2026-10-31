package lesson41;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* 
 * 問題②
 */
public class C41Q2 {

	public static void main(String[] args) {
		List<Point> list = new ArrayList<>();
		list.add(new Point(0, 8));
		list.add(new Point(1, 6));
		list.add(new Point(1, 9));
		list.add(new Point(3, 3));
		list.forEach(p -> p.print());
		
		System.out.println("---");
		
		Comparator<Point> cmp1 = (a, b) -> Integer.compare(b.x, a.x);
		Comparator<Point> cmp2 = (a, b) -> Integer.compare(b.y, a.y);
		Comparator<Point> cmp3 = cmp1.thenComparing(cmp2);
		Collections.sort(list, cmp3);
		list.forEach(p -> p.print());
	}
}

//0 8
//1 6
//1 9
//3 3
//---
//3 3
//1 9
//1 6
//0 8

