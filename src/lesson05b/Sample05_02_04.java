package lesson05b;

import java.util.Scanner;

public class Sample05_02_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (true) { // 無限ループ
			System.out.print("入力してください：");
			String line = scn.nextLine();
			if (line.equals("exit")) { // exitが入力されたら処理終了
				break;
			}
			System.out.println(line.toUpperCase()); // 大文字に変換
		}
		System.out.println("終了");
		scn.close();
	}
}
