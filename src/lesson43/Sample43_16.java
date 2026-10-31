package lesson43;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;

/*
 * min, max, count
 */
public class Sample43_16 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("abc", "of", "defghi", "hello", "word");
		
		// IntStreamの場合のmax,minメソッド
		OptionalInt minOpt = words.stream()
				.mapToInt(w -> w.length())
				.min();
		System.out.println(minOpt.getAsInt());	// 単語の最小文字数
		
		OptionalInt maxOpt = words.stream()
				.mapToInt(w -> w.length())
				.max();
		System.out.println(maxOpt.getAsInt());	//単語の最大文字数
		
		
		// Streamの場合のmax,minメソッド
		Comparator<String> cmp = (w1, w2) -> Integer.compare(w1.length(), w2.length());
		Optional<String> minOpt2 = words.stream().min(cmp);
		System.out.println(minOpt2.get());		//最小文字数の単語
		Optional<String> maxOpt2 = words.stream().max(cmp);
		System.out.println(maxOpt2.get());		//最大文字数の単語
		
		// countメソッド
		long even = new Random().ints(1000, 0, 100)
				.filter(x -> x % 2 == 0).count();
		System.out.println(even); 				// 乱数のうち偶数の数
		
	}
}
