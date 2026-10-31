package lesson42;

/*
 * （参考）文字
 */
public class Sample42_12 {
	public static void main(String[] args) {
		String text = "Hello World";
		text.chars().forEach(c -> System.out.print((char) c));

	}
}
/*
 * 文字列の並びを扱うCharSequenceインターフェースにストリームを返すメソッドが2つある
 *  charsメソッド
 */
