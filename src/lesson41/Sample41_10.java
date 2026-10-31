package lesson41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/*
 * コンストラクタ参照：
 * 　オブジェクトを生成することに特化したメソッド参照
 * 　　クラス名::new
 */
public class Sample41_10 {

	public static void main(String[] args) {
		
		// ラムダ式
		Supplier<Random> sp1 = () -> new Random();
		Random rnd1 = sp1.get();
		
		// コンストラクタ参照
		Supplier<Random> sp2 = Random::new;
		Random rnd2 = sp2.get();
		
		System.out.println(rnd1.nextInt(10) + ":" + rnd2.nextInt(10));
		
		
		
		// ラムダ式
		Supplier<List<String>> sp3 = () -> new ArrayList<>();
		List<String> list1 = sp3.get();
		
		// コンストラクタ参照
		Supplier<List<String>> sp4 = ArrayList<String>::new;
		List<String> list2 = sp4.get();
		
		System.out.println(list1 + ":" + list2);
		
		
		
		// コンストラクタの引数がある場合
		
		// ラムダ式
		Function<String, String> f1 = v -> new String(v);
		String str1 = f1.apply("abc");
		
		// コンストラクタ参照
		Function<String, String> f2 = String::new;
		String str2 = f2.apply("abc");
		
		System.out.println(str1 + ":" + str2);
		
		
		
		// 配列の生成
		
		// ラムダ式
		IntFunction<String[]> if1 = n -> new String[n];
		String[] s1 = if1.apply(5);
		
		// コンストラクタ参照
		IntFunction<String[]> if2 = String[]::new;
		String[] s2 = if2.apply(5);
		
		System.out.println(Arrays.toString(s1));
		System.out.println(Arrays.toString(s2));
	}

}
