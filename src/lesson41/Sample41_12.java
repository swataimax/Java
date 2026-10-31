package lesson41;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*
 * 高階関数：
 * 　関数を引数として受け取る、または戻り値として関数を返す関数のことを
 */
public class Sample41_12 {
	// コンストラクタ
	Sample41_12() {
		List<Integer> list = Arrays.asList(1, 2, 3);
		Comparator<Integer> cmp = (x, y) -> Integer.compare(x, y);
		Collections.sort(list, cmp); // 昇順に並び替え
		System.out.println(list);
		Collections.sort(list, reverse(cmp)); // 降順に並び替え
		System.out.println(list);
	}

	<T> Comparator<T> reverse(Comparator<T> cmp) {
		return (x, y) -> cmp.compare(y, x);
	}

	public static void main(String[] args) {
		new Sample41_12();
		
		
//		List<Integer> list = Arrays.asList(1, 2, 3);
//		Comparator<Integer> cmp = (x, y) -> Integer.compare(x, y);
//		Collections.sort(list, cmp); // 昇順に並び替え
//		System.out.println(list);
//		Collections.sort(list, reverse(cmp)); // 降順に並び替え
//		System.out.println(list);
		
	}
	
//	static <T> Comparator<T> reverse(Comparator<T> cmp) {
//		return (x, y) -> cmp.compare(y, x);
//	}

}


