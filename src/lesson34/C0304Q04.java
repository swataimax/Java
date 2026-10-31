package lesson34;

import java.util.ArrayList;
import java.util.List;

public class C0304Q04 {
	public static void main(String[] args) {
		List<String> srcList = List.of("佐藤", "鈴木", "高橋", "渡辺", "田中", "山田");
		List<String> dstList = new ArrayList<>();
		for (int i = 0; i < srcList.size(); i++) {
			dstList.add(srcList.get(i));
		}
		for (int j = 0; j < dstList.size(); j++) {
			System.out.println(dstList.get(j));
		}
	}
}
