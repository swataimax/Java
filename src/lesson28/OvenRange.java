package lesson28;

// Ovenインターフェースを継承したOvenRangeインターフェース
public interface OvenRange extends Oven {
	public static final int time = 10; // 時間

	public abstract void microwave();
}
