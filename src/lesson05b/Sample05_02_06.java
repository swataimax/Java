package lesson05b;

import java.util.Scanner;

public class Sample05_02_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean ok = true;
		while (ok) {
			System.out.print("入力してください：");
			String pw = scn.next();
			if (!pw.equals("java")) { // パスワードと一致しない場合
				continue;
			}
			ok = false; // パスワードと一致した場合は条件式をfalseに変更
		}
		System.out.println("ログイン完了");
		scn.close();
	}
}
