package calc;

import java.util.Scanner;

public class CalcA {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("入力してください：");
		int sum = scn.nextInt();
		String operator = "";
		do {
			System.out.print("演算子：");
			operator = scn.next();
			if (!"=".equals(operator)) {
				System.out.print("次の値：");
				int b = scn.nextInt();
				if ("+".equals(operator)) {
					System.out.println(sum + b);
					sum += b;

				} else if ("-".equals(operator)) {
					System.out.println(sum - b);
					sum -= b;
				} else if ("*".equals(operator)) {
					System.out.println(sum * b);
					sum *= b;
				} else if ("/".equals(operator)) {
					System.out.println(sum / b);
					sum /= b;
				}
			}
		} while (!"=".equals(operator));
		System.out.println(sum);
		System.out.println("計算終了");
		scn.close();
	}
}
