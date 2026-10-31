package calc;

import java.util.Scanner;

public class CalcA2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("入力してください：");
		if (scn.hasNextInt()) {
			//int sum = scn.nextInt();
			double sum = scn.nextInt();
			
			String operator = "";
			do {
				System.out.print("演算子：");
				operator = scn.next();
				if (("+".equals(operator) || "＋".equals(operator) ||
						"-".equals(operator) || "－".equals(operator) ||
						"*".equals(operator) || "×".equals(operator) ||
						"/".equals(operator) || "÷".equals(operator)) ||
						"=".equals(operator)) {
					
					if (!"=".equals(operator)) {
						
						System.out.print("次の値：");
						if (scn.hasNextInt()) {
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
								if (b ==0) {
									System.out.println("0では割れません");
								} else {
									double d = (double)sum / b;
									if (d == (int)d) {
										System.out.println((int)d);
									} else {
										System.out.println(d);
									}
									sum /= b;
								}
							} else {
								System.out.println("不正な値です");
							}
						} else {
							System.out.println("入力値が不正です");
							scn.next();		// 受け取ってあげないと次にうまく進めない
						}
					}
				} else {
					System.out.println("演算子が不正です");
				}
				
			} while (!"=".equals(operator));
			System.out.println(sum);
			System.out.println("計算終了");
		} else {
			System.out.println("1つ目の入力値が不正です");
		}
		scn.close();
	}
}
