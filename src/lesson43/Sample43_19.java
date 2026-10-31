package lesson43;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

/*
 * Optional
 */
public class Sample43_19 {
	public static void main(String[] args) {
//		int[] nums = { 1, 2, 3, 4, 5 };
		int[] nums = {};
		
		OptionalDouble aveOpt = Arrays.stream(nums)
				.average();
		double ave = aveOpt.orElse(0.0);
		System.out.println(ave);

		Optional<Integer> op = List.of(10, 20).stream()
				.max(Integer::compare);
		
		// 値を保持していない場合、NoSuchElementExceptionをスロー
		System.out.println(op.get());

		// 値を保持していない場合、0を返す
		System.out.println(op.orElse(0));

		// 値を保持していない場合、ラムダ式の実行を返す
		System.out.println(op.orElseGet(() -> 1));

		// 値を保持していない場合、ラムダ式を実行する
		// 結果としてIllegalArgumentExceptionをスローする
		System.out.println(op.orElseThrow(IllegalArgumentException::new));
		
		
		
		System.out.println("-----");
		
		
		Optional<Integer> op2 = List.of(10, 20).stream().filter(x -> x < 10)
				.max(Integer::compare);
		
		// 値を保持していない場合、NoSuchElementExceptionをスロー
//		System.out.println(op2.get());
		// 値を保持していない場合、0を返す
		System.out.println(op2.orElse(0));
		// 値を保持していない場合、ラムダ式の実行を返す
		System.out.println(op2.orElseGet(() -> 1));
		// 値を保持していない場合、ラムダ式を実行する
		// 結果としてIllegalArgumentExceptionをスローする
//		System.out.println(op2.orElseThrow(IllegalArgumentException::new));
		
	}
}
