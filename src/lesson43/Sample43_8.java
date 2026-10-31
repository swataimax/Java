package lesson43;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * セット化
 */
public class Sample43_8 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("abc", "abc", "ghi");
		Set<String> set = words.stream().collect(Collectors.toSet());
		System.out.println(set);
	}
}

//[abc, ghi]
// ↑Setなので重複する値(abc)が除去されている
