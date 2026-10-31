package lesson34;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex0304_02 {
	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();
		hashSet.add("あいうえお");
		hashSet.add("かきくけこ");
		hashSet.add("さしすせそ");
		hashSet.add("たちつてと");
		hashSet.add("たちつてと"); // 重複行
		hashSet.add("なにぬねの");
		System.out.println("hashSet" + hashSet);

		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("かきくけこ");
		linkedHashSet.add("あいうえお");
		linkedHashSet.add("さしすせそ");
		linkedHashSet.add("たちつてと");
		linkedHashSet.add("たちつてと"); // 重複行
		linkedHashSet.add("なにぬねの");
		System.out.println("linkedHashSet" + linkedHashSet);

		Set<String> treeSet = new TreeSet<>();
		treeSet.add("なにぬねの");
		treeSet.add("たちつてと");
		treeSet.add("たちつてと"); // 重複行
		treeSet.add("さしすせそ");
		treeSet.add("かきくけこ");
		treeSet.add("あいうえお");
		System.out.println("treeSet" + treeSet);
	}
}
