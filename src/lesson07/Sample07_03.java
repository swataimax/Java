package lesson07;

public class Sample07_03 {
	public static void main(String[] args) {
		// char aa = "a";     // これはコンパイルエラー
		// String s = 'a';     // これはコンパイルエラー
		char c1 = 'a';
		System.out.println(c1);
		char c2 = 0x0061;
		System.out.println(c2);
		char c3 = 97;
		System.out.println(c3);
		int i = 'a';
		System.out.println(i);	// 97
		// char c4 = -1;   // これはコンパイルエラー
		
		
		System.out.println("-");
		i = 'b';
		System.out.println(i);	// 98
		i = 'A';
		System.out.println(i); 	// 65
		
		
	}
}
