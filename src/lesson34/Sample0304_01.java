package lesson34;

import java.util.ArrayList;
import java.util.Collection;

public class Sample0304_01 {
	public static void main(String[] args) {
		// どのクラスで実行しても実行結果は同じ(データ構造は異なる)
		Collection<String> col = new ArrayList<String>();
		//Collection<String> col = new LinkedList<String>();
		//Collection<String> col = new HashSet<String>();
		col.add("abc");
		col.add("efg");
		col.add("hij");

		for (String str : col) {
			System.out.println(str);
		}
	}
}
