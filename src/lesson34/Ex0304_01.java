package lesson34;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Ex0304_01 {
	public static void main(String[] args) {
		Collection<String> col = new ArrayList<String>();
		col.add("abc");
		col.add("efg");
		col.add("hij");
		Iterator<String> it = col.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
	}
}
