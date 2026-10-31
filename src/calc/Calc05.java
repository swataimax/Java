package calc;

import java.util.Scanner;

public class Calc05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("1つ目の値は：");

		if (scn.hasNextInt()) { // 1つ目の入力値がint型か判定
			int a = scn.nextInt();
			System.out.print("演算子は：");
			String operator = scn.next();
			// 演算子の判定をひとまとめに変更
			if (("+".equals(operator) || "＋".equals(operator) ||
					"-".equals(operator) || "－".equals(operator) ||
					"*".equals(operator) || "×".equals(operator) ||
					"/".equals(operator) || "÷".equals(operator))) {
				System.out.print("2つ目の値は：");
				if (scn.hasNextInt()) { // 2つ目の入力値がint型か判定
					int b = scn.nextInt();
					if ("+".equals(operator) || "＋".equals(operator)) {
						System.out.println(a + b);
					} else if ("-".equals(operator) || "－".equals(operator)) {
						System.out.println(a - b);
					} else if ("*".equals(operator) || "×".equals(operator)) {
						System.out.println(a * b);
					} else if ("/".equals(operator) || "÷".equals(operator)) {
						if (b == 0) {
							System.out.println("0では割れません");
						} else {
							double d = (double) a / b;
							if (d == (int) d) {
								System.out.println((int) d);
							} else {
								System.out.println(d);
							}
						}
					} else {
						System.out.println("不正な値です");
					}
				} else {
					System.out.println("2つ目の入力値が不正です");
				}
			} else {
				System.out.println("演算子が不正です");
			}
		} else {
			System.out.println("1つ目の入力値が不正です");
		}
		scn.close();
	}
}
