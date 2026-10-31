package lesson28q;

public interface PC {
	public static final int height = 40; // 高さ（cm）
	public static final int width = 30; // 幅（cm）
	public static final int weight = 1000; // 重さ（g）

	default void start() { // デフォルトメソッド
		System.out.println("PCを起動します");
	}

	default void info(int width, int height, int weight) { // デフォルトメソッド
		System.out.println("PC情報");
		System.out.println("縦：" + width + "cm");
		System.out.println("横：" + height + "cm");
		System.out.println("重さ：" + weight + "g");
	}
}
