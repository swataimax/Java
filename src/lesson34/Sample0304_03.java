package lesson34;

import java.util.LinkedList;

public class Sample0304_03 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("abc");
		list.add("def");
		list.add("ghi");
		System.out.println(list);

		System.out.println("\nListの機能");
		System.out.println(list.get(0));

		System.out.println("\nQueueの機能");
		System.out.println(list.poll()); // 先頭の要素を切り取り
		System.out.println(list);
		System.out.println(list.poll()); // 先頭の要素を切り取り

		System.out.println(list);
		list.offer("jkl"); // 末尾に挿入
		list.offer("mno"); // 末尾に挿入
		System.out.println(list);

		System.out.println("\nStackの機能");
		list.push("pqr"); // 先頭に挿入
		System.out.println(list);
		list.pop(); // 先頭の要素を切り取り
		System.out.println(list);

		System.out.println("\nDequeの機能");
		list.addFirst("abc"); // 先頭に挿入
		System.out.println(list);
		list.addLast("xyz"); // 末尾に挿入
		System.out.println(list);
	}
}
