package calc;

import java.util.Scanner;

public class Calc03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("1つ目の値は：");
		int a = scn.nextInt();
		System.out.print("演算子は：");
		String operator = scn.next();
		System.out.print("2つ目の値は：");
		int b = scn.nextInt();
		if ("+".equals(operator)) {
			System.out.println(a + b);
		} else if ("-".equals(operator)) {
			System.out.println(a - b);
		} else if ("*".equals(operator)) {
			System.out.println(a * b);
		} else if ("/".equals(operator)) {
			if (b == 0) {
				System.out.println("0では割れません");
			} else {
				double d = (double) a / b;
				if (d == (int) d) { // 除算した結果が「.0」か判定
					System.out.println((int) d); // 「.0」の場合はintにキャスト
				} else {
					System.out.println(d); // 小数点以下がある場合はそのまま表示
				}
			}
		} else {
			System.out.println("不正な値です");
		}
		scn.close();
	}
}
