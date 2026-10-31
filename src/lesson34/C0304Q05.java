package lesson34;

import java.util.HashSet;
import java.util.Set;

public class C0304Q05 {
	public static void main(String[] args) {
		Set<String> srcList = new HashSet<>();
		srcList.add("東京");
		srcList.add("神奈川");
		srcList.add("埼玉");
		srcList.add("千葉");
		srcList.add("東京");

		// この初期化の方法では重複する値がある場合、実行時例外が発生する
		//Set<String> srcList = Set.of("東京", "神奈川", "埼玉", "千葉", "東京");

		Set<String> dstList = new HashSet<>();
		for (String str : srcList) {
			dstList.add(str);
		}
		for (String s : dstList) {
			System.out.println(s);
		}
	}
}
