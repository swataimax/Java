package lesson41;

/*
 * 自作したインターフェースでもラムダ式を用いて記述
 */

public class Sample41_4 {

	public static void main(String[] args) {
		
		// 無名クラス
		action(new Bird() {
			public void sing() {
				System.out.println("チュンチュン");
			}
		});
		
		// ラムダ式
		action(() -> {
			System.out.println("ホーホケキョ");
		});
	}

	static void action(Bird bird) {
		bird.sing();
	}

}
