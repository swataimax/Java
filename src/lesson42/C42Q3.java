package lesson42;

import java.util.stream.IntStream;

public class C42Q3 {
	public static void main(String[] args) {
		int y = IntStream.rangeClosed(1, 100).sum();
		System.out.println(y);
		
		
		System.out.println("-----");
		
		
		System.out.println(IntStream.rangeClosed(1, 100).sum());
		
	}
}
