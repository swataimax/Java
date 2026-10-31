package lesson31;

public class Sample0301_01b {
	public static void main(String[] args) {
		try {
			int[] arr = new int[3];
			System.out.println("配列の要素数は3です");
			arr[10] = 10;
			System.out.println("arr[10]に代入しました");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("例外が発生");
		}
		System.out.println("処理終了");
	}
}
