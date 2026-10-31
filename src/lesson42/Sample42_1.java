package lesson42;

import java.util.List;

/*
 * 内部イテレータ
 * 
 * StreamAPIは配列やコレクションに対して内部イテレータで繰り返しを行うためのAPI
 *  
 */
public class Sample42_1 {
	public static void main(String[] args) {
		// 外部イテレータ
		List<String> items = List.of("a", "b", "c");
		for (String s : items) {
			System.out.print(s + " ");
		}
		
		System.out.println(); // 改行
		
		// 内部イテレータ
		items.forEach(s -> System.out.print(s + " "));
	}
}

/* 
 * IterableインターフェースのforEachメソッドは
 * 引数に処理内容を渡すと内部で繰り返し処理を行ってくれる。
 * このように内部で繰り返し処理を行い、外には繰り返しの表示が現れない繰り返しを内部イテレータという
 */

/*
 * StreamAPIは内部イテレータを実現するためのAPI
 */
