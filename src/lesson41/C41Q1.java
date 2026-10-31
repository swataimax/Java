package lesson41;

import java.util.ArrayList;
import java.util.List;

/* 
 * 問題①
 */
public class C41Q1 {

	public static void main(String[] args) {
		List<Point> list = new ArrayList<>();
		list.add(new Point(0, 8));
		list.add(new Point(1, 6));
		list.add(new Point(1, 9));
		list.add(new Point(3, 3));
		list.forEach(p -> p.print());//要素の値をすべて表示
		
		System.out.println("---");
		
		list.forEach((p -> {
			int tmp = p.y;
			p.y = p.x;
			p.x = tmp;
		}));
		
		list.forEach(p -> p.print());//要素の値をすべて表示
	}
}


//0 8
//1 6
//1 9
//3 3
//---
//8 0
//6 1
//9 1
//3 3


