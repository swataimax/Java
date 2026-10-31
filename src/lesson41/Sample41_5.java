package lesson41;

/*
 * ラムダ式の省略形
 */

public class Sample41_5 {

	public static void main(String[] args) {
		
		Calc c1 = (int x) -> {return x * x;}; // 省略なし
		
		Calc c2 = (x) -> {return x * x;}; // 引数の型を省略
		
		Calc c3 = x -> {return x * x;}; // 引数の型と括弧を省略
		
		Calc c4 = x -> x * x; // 引数、戻り値の両方ともすべて省略
		
		System.out.println("c1 = " + c1.calc(2));
		System.out.println("c2 = " + c2.calc(3));
		System.out.println("c3 = " + c3.calc(4));
		System.out.println("c4 = " + c4.calc(5));
	}
}


@FunctionalInterface
interface Calc {
	public int calc(int x);
}

