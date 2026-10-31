package lesson42;

import java.util.stream.Stream;

/*
 * peek
 */
public class Sample42_20 {
	public static void main(String[] args) {
		Stream.of("one", "two", "three", "four")
				.filter(s -> s.length() > 3)
				.peek(e -> System.out.println("Filtered:" + e))
				.map(String::toUpperCase)
				.forEach(System.out::println);
	}
}
/*
 * 単語のストリームから長さ3のものを抜き出し大文字に変換して表示を行う
 * ここで長さ3の単語を抜き出したときに確認用にpeekメソッドを使用して途中経過を表示している
 */

