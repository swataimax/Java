package lesson41;

import java.util.function.BiFunction;
import java.util.function.Function;

/*
 * インスタンスメソッド参照でオブジェクトを指定できない場合：
 * 　クラス名::メソッド名
 */
public class Sample41_9 {

	public static void main(String[] args) {
		// ラムダ式
		Function<String, String> f1 = text -> text.trim();
        System.out.println(f1.apply(" Hello "));
        
        // インスタンスメソッド参照
        Function<String, String> f2 = String::trim;
        System.out.println(f2.apply(" World "));
        
        // ラムダ式
        BiFunction<String, String, String> f3 =
        		(text, append) -> text.concat(append);
        System.out.println(f3.apply("Hello ", "World"));
        
        // インスタンスメソッド参照
        BiFunction<String, String, String> f4 = String::concat;
        System.out.println(f4.apply("abc ", "def"));
	}

}
