package lesson41;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

/*
 * インスタンスメソッド参照：
 * 　メソッド参照で参照するメソッドがインスタンスメソッドの場合
 * 　 インスタンスメソッドの場合、
 * 　・メソッド呼び出しの対象となるオブジェクトを指定できる場合と
 * 　・指定できない場合で2種類の書き方がある。
 * 
 * インスタンスメソッド参照でオブジェクトを指定できる場合：
 * 　オブジェクト名::メソッド名
 * 
 */
public class Sample41_8 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		
		Consumer<String> c1 = text -> list1.add(text); // ラムダ式
		c1.accept("a");
		
		Consumer<String> c2 = list1::add; // メソッド参照
		c2.accept("b");
		
		System.out.println(list1);
		
		List<String> list2 = new ArrayList<>();
		
		list2 = new LinkedList<>(); // 再代入
		// Consumer<String> c3 = text -> list2.add(text); // NG
		
		Consumer<String> c4 = list2::add; // OK
		c4.accept("c");
		
		System.out.println(list2);
	}
}

/*
 * ラムダ式とメソッド参照は同じように使用できるが、メソッド参照はfinalではないローカル変数へのアクセスが可能である。
 * ローカル変数listにオブジェクトを再代入してメソッド参照を使用しているが問題なくコンパイルできる。
 * 一方、ラムダ式で上記と同じことを行うとコンパイルエラーになる。
 */

/*
 * メソッド参照はローカル変数がfinalまたは実質的finalではなくてもア
クセスできる
 */
