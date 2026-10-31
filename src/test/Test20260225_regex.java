package test;

public class Test20260225_regex {

	public static void main(String[] args) {
		String str = "";
		String regex = "";
		
		// 完全一致
		regex = "a";
		System.out.println(regex);
		System.out.println("a".matches(regex));		// true
		System.out.println("ab".matches(regex));	// false
		System.out.println("aba".matches(regex));	// false
		
		// 完全一致
		regex = "[abc]";
		System.out.println(regex);
		System.out.println("a".matches(regex));		// true
		System.out.println("b".matches(regex));		// true
		System.out.println("c".matches(regex));		// true
		System.out.println("ab".matches(regex));	// false
		
		// 完全一致
		regex = "[a-c]";
		System.out.println(regex);
		System.out.println("a".matches(regex));		// true
		System.out.println("b".matches(regex));		// true
		System.out.println("c".matches(regex));		// true
		System.out.println("ab".matches(regex));	// false
		
		// 完全一致
		regex = "[a-zA-z0-9]";
		System.out.println(regex);
		System.out.println("a".matches(regex));		// true
		System.out.println("A".matches(regex));		// true
		System.out.println("0".matches(regex));		// true
		System.out.println("9".matches(regex));		// true
		System.out.println(".".matches(regex));		// false
		System.out.println("-".matches(regex));		// false
		
		// 完全一致
		regex = "[ab\\\\c]";	// aかbか\（１文字）かcか
		System.out.println(regex);
		System.out.println("a".matches(regex));		// ture
		System.out.println("b".matches(regex));		// true
		System.out.println("c".matches(regex));		// true
		System.out.println("\\".matches(regex));	// true
		System.out.println("\\\\".matches(regex));	// false
		
		// 完全一致
		regex = "[\\.\\^\\$\\|\\+\\*\\?]";	// . か ^ か $ か | か + か * か ? か
		System.out.println(regex);
		// [\.\^\$\|]
		// \\.と書いているのは、\がJavaのエスケープシーケンスだから
		System.out.println("a".matches(regex));		// false
		System.out.println(".".matches(regex));		// true
		System.out.println("^".matches(regex));		// true
		System.out.println("$".matches(regex));		// true
		System.out.println("|".matches(regex));		// true
		System.out.println("+".matches(regex));		// true
		System.out.println("*".matches(regex));		// true
		System.out.println("?".matches(regex));		// true
		
		// 完全一致
		regex = "[\\[\\]\\(\\)\\{\\}]";	// [ か ] か ( か ) か { か } か
		System.out.println(regex);
		// [\[\]\(\)\{\}]
		// \\[と書いているのは、\がJavaのエスケープシーケンスだから
		System.out.println("a".matches(regex));		// false
		System.out.println("[".matches(regex));		// true
		System.out.println("(".matches(regex));		// true
		System.out.println("{".matches(regex));		// true
		
		// 完全一致
		regex = "[a-]";	// aか-か
		System.out.println(regex);
		System.out.println("a".matches(regex));		// true
		System.out.println("b".matches(regex));		// false
		System.out.println("-".matches(regex));		// true
		
		// 完全一致
		// regex = "[a\\+-\\*/]";	// a か + か - か * か /	これだとエラーになる 
		regex = "[a\\+\\*/-]";	// a か + か - * / 
		System.out.println(regex);
		System.out.println("a".matches(regex));		// true
		System.out.println("+".matches(regex));		// true
		System.out.println("-".matches(regex));		// true
		System.out.println("*".matches(regex));		// true
		System.out.println("/".matches(regex));		// true
		
		// 完全一致
		regex = "[a\\-c\\[\\]]";	// a か - か c か [ か ] か 
		System.out.println(regex);
		System.out.println("a".matches(regex));		// true
		System.out.println("b".matches(regex));		// false
		System.out.println("c".matches(regex));		// true
		System.out.println("-".matches(regex));		// true
		System.out.println("[".matches(regex));		// true
		System.out.println("]".matches(regex));		// true
		// https://www-creators.com/archives/3102
		// 「[」、「]」で文字を囲むと、文字クラスと呼ばれた特別な表現
		// 文字クラス内でのみ特殊な意味をもつ「-」や「]」はエスケープが必要
		// 「[」はエスケープは不要（エスケープしても構わない）
		
		// 完全一致
		regex = "[a+*/-]";	// a か + か - か * か / 
		System.out.println(regex);
		System.out.println("a".matches(regex));		// true
		System.out.println("+".matches(regex));		// true
		System.out.println("-".matches(regex));		// true
		System.out.println("*".matches(regex));		// true
		System.out.println("/".matches(regex));		// true
		// https://www-creators.com/archives/3102
		// 文字クラスでは、正規表現の通常のメタ文字は特別な意味をもちませんのでエスケープが不要
		
		// 完全一致
		regex = "a|-";	// a か - 
		System.out.println(regex);
		System.out.println("a".matches(regex));		// true
		System.out.println("-".matches(regex));		// true
		System.out.println("+".matches(regex));		// false
		
		// 完全一致
		regex = "a|b|c|d|e";	// a か b か c か d か e 
		System.out.println(regex);
		System.out.println("a".matches(regex));		// true
		System.out.println("b".matches(regex));		// true
		System.out.println("c".matches(regex));		// true
		System.out.println("d".matches(regex));		// true
		System.out.println("e".matches(regex));		// true
		System.out.println("f".matches(regex));		// false
		System.out.println("g".matches(regex));		// false
		
		// 完全一致
		regex = "abc|bcd|cde";	// abc か bcd か cde
		System.out.println(regex);
		System.out.println("abc".matches(regex));		// true
		System.out.println("bcd".matches(regex));		// true
		System.out.println("cde".matches(regex));		// true
		System.out.println("def".matches(regex));		// false
		// https://www-creators.com/archives/5039
		// 「|」は、ひと続きの正表現パターン同士をまるごと対象とし、OR関係を記述
		// そうではなく、正規表現パターンの範囲を限定したい場合、括弧を使ってグルーピングする必要あり
		
		// 完全一致
		regex = "ab(c|d|e)";	// abc か abd か abe
		System.out.println(regex);
		System.out.println("abc".matches(regex));		// true
		System.out.println("abd".matches(regex));		// true
		System.out.println("abe".matches(regex));		// true
		System.out.println("bcd".matches(regex));		// false
		
		// 完全一致
		regex = "ab(cd|de|eg)h";	// abcdh か abdeh か abegh
		System.out.println(regex);
		System.out.println("abcdh".matches(regex));		// true
		System.out.println("abdeh".matches(regex));		// true
		System.out.println("abegh".matches(regex));		// true
		System.out.println("bcdgh".matches(regex));		// false
		
		// 完全一致
		regex = "[\\^a-c]";	// ^ か a-c 
		System.out.println(regex);
		System.out.println("a".matches(regex));		// true
		System.out.println("b".matches(regex));		// true
		System.out.println("c".matches(regex));		// true
		System.out.println("d".matches(regex));		// false
		System.out.println("^".matches(regex));		// true
		System.out.println("$".matches(regex));		// false
		// https://www-creators.com/archives/3102
		// 「文字クラスの否定」を表す「^」は文字クラス開始の「[」の直後でのみ意味を持つので、
		// 文字クラスの開始が、文字としての「^」であれば、エスケープが必要
				
		// 完全一致
		regex = "[^a-c]";	// a-c でない 
		System.out.println(regex);
		System.out.println("a".matches(regex));		// false
		System.out.println("b".matches(regex));		// false
		System.out.println("c".matches(regex));		// false
		System.out.println("d".matches(regex));		// true
		System.out.println("^".matches(regex));		// true
		System.out.println("$".matches(regex));		// true
		// https://www-creators.com/archives/3102
		// 「文字クラスの否定」を表す「^」
		
		// 完全一致
		regex = "[^0-9]";	// 数値でない 
		System.out.println(regex);
		System.out.println("a".matches(regex));		// true
		System.out.println("b".matches(regex));		// true
		System.out.println("0".matches(regex));		// false
		System.out.println("1".matches(regex));		// false
		
		// 完全一致
		regex = "[^!\"#$%&'()\\*\\+\\-\\.,\\/:;<=>?@\\[\\\\\\]^_`{|}~]";	// 数値でない 
		System.out.println(regex);
		System.out.println("a".matches(regex));		// true
		System.out.println("0".matches(regex));		// false
		System.out.println("!".matches(regex));		// false
		System.out.println("\"".matches(regex));		// false
		System.out.println("#".matches(regex));		// false
		System.out.println("$".matches(regex));		// false
		System.out.println("%".matches(regex));		// false
		System.out.println("&".matches(regex));		// false
		System.out.println("'".matches(regex));		// false
		System.out.println("(".matches(regex));		// false
		System.out.println(")".matches(regex));		// false
		System.out.println("*".matches(regex));		// false
		System.out.println("+".matches(regex));		// false
		System.out.println("-".matches(regex));		// false
		System.out.println(".".matches(regex));		// false
		System.out.println(",".matches(regex));		// false
		System.out.println("/".matches(regex));		// false
		System.out.println(":".matches(regex));		// false
		System.out.println(";".matches(regex));		// false
		System.out.println("<".matches(regex));		// false
		System.out.println("=".matches(regex));		// false
		System.out.println(">".matches(regex));		// false
		System.out.println("?".matches(regex));		// false
		System.out.println("@".matches(regex));		// false
		System.out.println("[".matches(regex));		// false
		System.out.println("\\".matches(regex));	// false
		System.out.println("]".matches(regex));		// false
		System.out.println("^".matches(regex));		// false
		System.out.println("_".matches(regex));		// false
		System.out.println("`".matches(regex));		// false
		System.out.println("{".matches(regex));		// false
		System.out.println("|".matches(regex));		// false
		System.out.println("}".matches(regex));		// false
		System.out.println("~".matches(regex));		// false
		
		// 完全一致
		regex = "[^ ]";	// 半角スペースでない 
		System.out.println(regex);
		System.out.println("a".matches(regex));		// true
		System.out.println(" ".matches(regex));		// false
		System.out.println("_".matches(regex));		// true
		
		// 完全一致
		regex = "[ ]";	// 半角スペース 
		System.out.println(regex);
		System.out.println("a".matches(regex));		// false
		System.out.println(" ".matches(regex));		// true
		System.out.println("_".matches(regex));		// false
		
		// 完全一致
		regex = "[ぁ-んァ-ン０-９a-zA-Z0-9]";	// 特定の文字のみ 
		System.out.println(regex);
		System.out.println("a".matches(regex));		// false
		System.out.println("A".matches(regex));		// true
		System.out.println("1".matches(regex));		// true
		System.out.println("１".matches(regex));	// true
		System.out.println("あ".matches(regex));	// true
		System.out.println("ア".matches(regex));	// true
		System.out.println("ァ".matches(regex));	// true
		System.out.println("ｱ".matches(regex));		// false
		
		// 完全一致
		regex = "\\s";	// 空白文字（半角スペース、タブ、改行、改ページ）
		System.out.println(regex);
		System.out.println(" ".matches(regex));		// true
		System.out.println("　".matches(regex));	// false
		System.out.println("\t".matches(regex));	// true
		System.out.println("\n".matches(regex));	// true
		System.out.println("\r".matches(regex));	// true
		System.out.println("\f".matches(regex));	// true
		
		// 完全一致
		regex = "\\S";	// 空白文字（半角スペース、タブ、改行、改ページ）以外
		System.out.println(regex);
		System.out.println(" ".matches(regex));		// false
		System.out.println("　".matches(regex));	// true
		System.out.println("\t".matches(regex));	// false
		System.out.println("\n".matches(regex));	// false
		System.out.println("\r".matches(regex));	// false
		System.out.println("\f".matches(regex));	// false
		// 反対となるメタ文字「\S」
		
		// 完全一致
		regex = "[ \\t\\n\\r\\f]";	// 空白文字（半角スペース、タブ、改行、改ページ）
		System.out.println(regex);	// [ \t\n\r\f]
		System.out.println(" ".matches(regex));		// true
		System.out.println("　".matches(regex));	// false
		System.out.println("\t".matches(regex));	// true
		System.out.println("\n".matches(regex));	// true
		System.out.println("\r".matches(regex));	// true
		System.out.println("\f".matches(regex));	// true
		
		// 完全一致
		regex = "[^ \\t\\n\\r\\f]";	// 空白文字（半角スペース、タブ、改行、改ページ）以外
		System.out.println(regex);	// [^ \t\n\r\f]
		System.out.println(" ".matches(regex));		// false
		System.out.println("　".matches(regex));	// true
		System.out.println("\t".matches(regex));	// false
		System.out.println("\n".matches(regex));	// false
		System.out.println("\r".matches(regex));	// false
		System.out.println("\f".matches(regex));	// false
		
		// 完全一致
		regex = "\\d";	// [0-9]と同じ
		System.out.println(regex);	// \d
		System.out.println(" ".matches(regex));	// false
		System.out.println("1".matches(regex));	// true
		System.out.println("１".matches(regex));// true
		System.out.println("a".matches(regex));	// true
		System.out.println("A".matches(regex));	// true
		
		
//		// 前方一致
//		// 完全一致
		regex = "\\D";	// [^0-9]と同じ
		System.out.println(regex);	// \d
		System.out.println(" ".matches(regex));	// true
		System.out.println("1".matches(regex));	// false
		System.out.println("１".matches(regex));// true
		System.out.println("a".matches(regex));	// true
		System.out.println("A".matches(regex));	// true
		
		
		
		
		
//		regex = "^a";
//		System.out.println("a".matches(regex));	// true
//		System.out.println("ab".matches(regex));
//		System.out.println("aba".matches(regex));
//		
//		// 後方一致
//		regex = "a$";
//		System.out.println("a".matches(regex));
//		System.out.println("ab".matches(regex));
//		System.out.println("CBA".matches("A$"));
//		
		// aと任意の1文字
		regex = "a.";
		System.out.println(regex);
		System.out.println("a".matches(regex));		// false
		System.out.println("ab".matches(regex));	// true
		System.out.println("aba".matches(regex));	// false
		
		// aと任意の文字列（０文字以上）
		regex = "a.*";
		System.out.println(regex);
		System.out.println("a".matches(regex));		// true
		System.out.println("ab".matches(regex));	// true
		System.out.println("aba".matches(regex));	// true
		
		// aと任意の文字列（１文字以上）
		regex = "a.+";
		System.out.println(regex);
		System.out.println("a".matches(regex));		// false
		System.out.println("ab".matches(regex));	// true
		System.out.println("aba".matches(regex));	// true
		
		// 任意の文字列（１文字以上）とa
		regex = ".+a";
		System.out.println(regex);
		System.out.println("a".matches(regex));		// false
		System.out.println("ab".matches(regex));	// false
		System.out.println("aba".matches(regex));	// true
		
		// 任意の文字列（１文字以上）とaと任意の文字列（１文字以上）
		regex = ".+a.+";
		System.out.println(regex);
		System.out.println("a".matches(regex));		// false
		System.out.println("ab".matches(regex));	// false
		System.out.println("aba".matches(regex));	// false
		
		// 任意の文字列（0文字以上）とaと任意の文字列（0文字以上）
		regex = ".*a.*";
		System.out.println(regex);
		System.out.println("a".matches(regex));		// true
		System.out.println("ab".matches(regex));	// true
		System.out.println("aba".matches(regex));	// true
		
		
		
		// https://itsakura.com/regular-expressions#sa3
		
		// 数値2桁
		regex = "\\d\\d";
		System.out.println(regex);
		System.out.println("0".matches(regex));		// false
		System.out.println("01".matches(regex));	// true
		System.out.println("012".matches(regex));	// false
		System.out.println("0123".matches(regex));	// false
		System.out.println("01234".matches(regex));	// false
		
		// 数値2桁
		regex = "\\d{2}";
		System.out.println(regex);
		System.out.println("0".matches(regex));		// false
		System.out.println("01".matches(regex));	// true
		System.out.println("012".matches(regex));	// false
		System.out.println("0123".matches(regex));	// false
		System.out.println("01234".matches(regex));	// false
		
		// 数値3桁
		regex = "\\d\\d\\d";
		System.out.println(regex);
		System.out.println("0".matches(regex));		// false
		System.out.println("01".matches(regex));	// false
		System.out.println("012".matches(regex));	// true
		System.out.println("0123".matches(regex));	// false
		System.out.println("01234".matches(regex));	// false
		
		// 数値3桁
		regex = "\\d{3}";
		System.out.println(regex);
		System.out.println("0".matches(regex));		// false
		System.out.println("01".matches(regex));	// false
		System.out.println("012".matches(regex));	// true
		System.out.println("0123".matches(regex));	// false
		System.out.println("01234".matches(regex));	// false
		
		// 数値4桁
		regex = "\\d{4}";
		System.out.println(regex);
		System.out.println("0".matches(regex));		// false
		System.out.println("01".matches(regex));	// false
		System.out.println("012".matches(regex));	// false
		System.out.println("0123".matches(regex));	// true
		System.out.println("01234".matches(regex));	// false
		
		// 数値4桁
		regex = "\\d{4}";
		System.out.println(regex);
		System.out.println("0".matches(regex));		// false
		System.out.println("01".matches(regex));	// false
		System.out.println("012".matches(regex));	// false
		System.out.println("0123".matches(regex));	// true
		System.out.println("01234".matches(regex));	// false
		
		// 数値2桁～4桁
		regex = "\\d{2,4}";
		System.out.println(regex);
		System.out.println("0".matches(regex));		// false
		System.out.println("01".matches(regex));	// true
		System.out.println("012".matches(regex));	// true
		System.out.println("0123".matches(regex));	// true
		System.out.println("01234".matches(regex));	// false
				
		// 数値2桁以上
		regex = "\\d{2,}";
		System.out.println(regex);
		System.out.println("0".matches(regex));		// false
		System.out.println("01".matches(regex));	// true
		System.out.println("012".matches(regex));	// true
		System.out.println("0123".matches(regex));	// true
		System.out.println("01234".matches(regex));	// true
		
		// 数値2桁以下
		regex = "\\d{0,2}";
		System.out.println(regex);
		System.out.println("".matches(regex));		// true
		System.out.println("0".matches(regex));		// true
		System.out.println("01".matches(regex));	// true
		System.out.println("012".matches(regex));	// false
		System.out.println("0123".matches(regex));	// false
		System.out.println("01234".matches(regex));	// false
		
		
		
		
		
		
		// https://www-creators.com/archives/5332
		// 正規表現(Regular Expression)
		
		
	}

}
