package calc;

import java.util.Scanner;

// メソッド化
public class CalcA3 {
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
				if (isPlus(operator) ||
						isMinus(operator) ||
						isTimes(operator) ||
						isDivide(operator) ||
						"=".equals(operator)) {
					
					if (!"=".equals(operator)) {
						
						System.out.print("次の値：");
						if (scn.hasNextInt()) {
							int b = scn.nextInt();
							
							if (isPlus(operator)) {
								System.out.println(sum + b);
								sum += b;
							} else if (isMinus(operator)) {
								System.out.println(sum - b);
								sum -= b;
							} else if (isTimes(operator)) {
								System.out.println(sum * b);
								sum *= b;
							} else if (isDivide(operator)) {
								if (b == 0) {
									System.out.println("0では割れません");
								} else {
									double d = (double) sum / b;
									if (d == (int) d) {
										System.out.println((int) d);
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
							scn.next(); // 受け取ってあげないと次にうまく進めない
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
