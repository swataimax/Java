package lesson31;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sample0301_02 {
	public static void main(String[] args) {
		try {
			int[] arr = new int[3];
			System.out.println("配列の要素数は3です");
			Scanner scn = new Scanner(System.in);
			System.out.print("インデックスを入力してください：");
			// InputMismatchExceptionが発生する可能性がある
			int x = scn.nextInt();
			// ArrayIndexOutOfBoundsExceptionが発生する可能性がある
			arr[x] = 10;
			System.out.println("arr[" + x + "]に代入しました");
			scn.close();

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(
					"ArrayIndexOutOfBoundsExceptionが発生");
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchExceptionが発生");
		}
		System.out.println("処理終了");
	}
}
