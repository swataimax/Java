package lesson42;

import java.util.stream.IntStream;

public class C42Q4 {
	public static void main(String[] args) {
		int z = IntStream.rangeClosed(1, 100)
				.filter(i -> i % 2 == 0)
				.sum();
		System.out.println(z);
		
		
		System.out.println("-----");
		
		System.out.println(IntStream.rangeClosed(1, 100).filter(i -> i % 2 == 0).sum());
		
	}
}