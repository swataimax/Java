package lesson41;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/*
 * メソッド参照：
 * 　ラムダ式の処理がメソッドの呼び出し1つのみのとき、メソッド参照と呼ばれる書き方ができる
 * 　メソッド参照は呼び出すメソッドにより、3種類に分けられる
 * 
 * クラスメソッド参照：
 * 　メソッド参照で参照するメソッドがstaticメソッドの場合
 * 
 */
public class Sample41_7 {

	public static void main(String[] args) {
		Consumer<String> c1 = text -> MyPrint2.print(text);
		
		// ラムダ式の書き方
		c1.accept("test1");
		
		// クラスメソッド参照の書き方
		Consumer<String> c2 = MyPrint2::print;
		c2.accept("test2");
		
		// ラムダ式の書き方
		BiConsumer<String, Integer> c3 = (a, b) -> MyPrint2.print(a, b);
		c3.accept("test3", 1);
		
		// クラスメソッド参照の書き方
		BiConsumer<String, Integer> c4 = MyPrint2::print;
		c4.accept("test4", 2);
	}
}

class MyPrint2 {
	public static void print(String text) {
		System.out.println(text);
	}

	public static void print(String a, Integer b) {
		System.out.println(a + "-" + b);
	}
}
