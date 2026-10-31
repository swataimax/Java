package calc; //パッケージ名はcalcとする

import java.util.Scanner;

public class Calc01 {
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
			System.out.println((double) a / b); // doubleでキャスト
		} else {
			// 演算子に 「+」、「-」、「*」、「/」以外が入力された場合
			System.out.println("不正な値です");
		}
		scn.close();
	}
}
