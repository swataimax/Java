package lesson41;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * 合成関数
 */

public class Sample41_13 {

	public static void main(String[] args) {
		Comparator<Student> cmp1 = (s1, s2) -> s1.getFirst().compareTo(s2.getFirst());
		Comparator<Student> cmp2 = (s1, s2) -> s1.getLast().compareTo(s2.getLast());
		Comparator<Student> cmp3 = cmp1.thenComparing(cmp2);
		// ComparatorインターフェースのthenComparingメソッド
		
		List<Student> list = new ArrayList<>();
		list.add(new Student("yamada", "akira"));
		list.add(new Student("ishikawa", "daijiro"));
		list.add(new Student("yamada", "takeshi"));
		Collections.sort(list, cmp3);
		
		System.out.println(list);
		// 第1キーが等しい場合、第2キーで比較して並び替えられた結果が表示
	}
}

class Student {
	private String first;
	private String last;

	Student(String first, String last) {
		this.first = first;
		this.last = last;
	}
	public String getFirst() {
		return first;
	}
	public String getLast() {
		return last;
	}
	@Override
    public String toString() {
        return first + " " + last;
    }
}
