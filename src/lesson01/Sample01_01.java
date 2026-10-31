package lesson01;

public class Sample01_01 {

	public static void main(String[] args) {
		System.out.println("こんにちは");
		
		int i;
		System.out.println((double)1/0);	// Infinity
		System.out.println(1.0/0);			// Infinity
		System.out.println(1/0.0);			// Infinity
		System.out.println(1/0);			// java.lang.ArithmeticException:
		
		
	}

}
