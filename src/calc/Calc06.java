package calc;

import java.util.Scanner;

public class Calc06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("1つ目の値は：");
		int a = 0;
		if (scn.hasNextInt()) {
			a = scn.nextInt(); // 1つ目の入力値
			System.out.print("演算子は：");
			String operator = scn.next();

			if (isPlus(operator) ||
					isMinus(operator) ||
					isTimes(operator) ||
					isDivide(operator)) { // 演算子であるか判定
				System.out.print("2つ目の値は：");

				if (scn.hasNextInt()) {
					int b = scn.nextInt(); // 2つ目の入力値
					calculation(a, b, operator); // 計算結果を出力
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

	// 引数の値と演算子で計算を行う
	static void calculation(int a, int b, String operator) {
		if (isPlus(operator)) { // 演算子が「+」か「＋」か判定
			System.out.println(a + b);
		} else if (isMinus(operator)) { // 演算子が「-」か「ー」か判定
			System.out.println(a - b);
		} else if (isTimes(operator)) { // 演算子が「*」か「×」判定
			System.out.println(a * b);
		} else if (isDivide(operator)) { // 演算子が「/」か「÷」か判定
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
		}
	}

	// 演算子が「+」または「＋」の場合はtrue
	static boolean isPlus(String operator) {
		return "+".equals(operator) || "＋".equals(operator);
	}

	// 演算子が「-」または「－」の場合はtrue
	static boolean isMinus(String operator) {
		return "-".equals(operator) || "－".equals(operator);
	}

	// 演算子が「*」または「×」の場合はtrue
	static boolean isTimes(String operator) {
		return "*".equals(operator) || "×".equals(operator);
	}

	// 演算子が「/」または「÷」の場合はtrue
	static boolean isDivide(String operator) {
		return "/".equals(operator) || "÷".equals(operator);
	}
}
