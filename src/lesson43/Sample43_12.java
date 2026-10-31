package lesson43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * collect
 * Collectorインターフェースを使用しないcollectメソッド
 *  基本型に対応したストリームでは、この形式のcollectメソッドのみ使用できる。
 *  ・第1引数のsupplierで結果を格納するためのオブジェクトを生成し、
 *  ・第2引数のaccumlatorで集約を行い、
 *  ・第3引数のcombinerで部分集約をまとめる
 */
public class Sample43_12 {
	public static void main(String[] args) {
		String[] words = { "blue", "green", "magenta", "red", "yellow" };
		List<String> list = Arrays.stream(words)
				.collect(ArrayList::new,
						ArrayList::add,
						ArrayList::addAll);
		System.out.println(list);
	}
}
/*
 * ストリームをListに変換
 *  第1引数のラムダ式は結果となるリストを生成している。
 *  第2引数はリストに対して要素を追加している。第2引数のBiConsumerの戻り値はvoidとなる。
 *  第3引数の型もBiConsumerインターフェースとなる。
 */

