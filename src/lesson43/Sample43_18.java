package lesson43;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

/*
 * sum, average
 */
public class Sample43_18 {
	public static void main(String[] args) {
		int[] nums = IntStream.rangeClosed(0, 100).toArray();
		int sum = Arrays.stream(nums).sum();
		System.out.println(sum);

		OptionalDouble opt = Arrays.stream(nums).average();
		double d = opt.getAsDouble();
		System.out.println(d);
	}
}
