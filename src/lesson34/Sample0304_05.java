package lesson34;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sample0304_05 {
	public static void main(String[] args) {
		List<String> srcList = new ArrayList<>();
		srcList.add("aaa");
		srcList.add("bbb");
		srcList.add("ccc");
		srcList.add("ddd");

		srcList.add("aaa"); // 重複行
		srcList.add("eee");
		srcList.add("eee "); // 半角スペースがある(除去されない)
		System.out.println("重複除去前List:" + srcList);
		List<String> dstList = new ArrayList<>();
		for (String str : srcList) {
			// リストに追加する値が含まれていない場合
			if (!dstList.contains(str)) {
				dstList.add(str);
			}
		}
		System.out.println("重複除去後List:" + dstList);

		Set<String> set = new HashSet<>();
		set.add("aaa");
		set.add("bbb");

		set.add("ccc");
		set.add("ddd");
		set.add("aaa"); // 重複行
		set.add("eee");
		set.add("eee "); // 半角スペースがある(除去されない)

		System.out.println("Set:" + set);
	}
}
