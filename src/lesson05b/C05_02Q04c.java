package lesson05b;

public class C05_02Q04c {
	public static void main(String[] args) {
		int i = 9;
		while (i++ < 18) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		int j = 9;
		while (++j <= 18) {
			if (j % 2 == 1) {
				continue;
			}
			System.out.print(j + " ");
		}
		
		
	}
}
