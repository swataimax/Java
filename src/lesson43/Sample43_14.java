package lesson43;

import java.util.Arrays;

/*
 * (参考)allMatch,anyMatch,noneMatch
 */
public class Sample43_14 {
	public static void main(String[] args) {
		int[] n = { 1, 2, 3, 4, 5 };
		// すべて偶数か調べる
		boolean all = Arrays.stream(n).allMatch(x -> x % 2 == 0);
		System.out.println(all);
		
		// 偶数の要素が存在するか調べる
		boolean any = Arrays.stream(n).anyMatch(x -> x % 2 == 0);
		System.out.println(any);
		
		// すべて奇数か調べる
		boolean none = Arrays.stream(n).noneMatch(x -> x % 2 == 0);
		System.out.println(none);
	}
}
/*
 * ストリームが空の場合、allMatchメソッドはtrue、anyMatch
 * メソッドはfalse、noneMatchメソッドはtrueを返す
 */
