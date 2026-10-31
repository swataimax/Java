package lesson38;

/**
 * ドキュメンテーションコメント付与クラス
 * @author yamada-taro
 * @version 1.1
 * @since 1.0
 */
public class Sample0308_02_01 {
	/** 幅 */
	private int w;

	/** 高さ */
	public int h;

	/**
	 * コンストラクタ<br>
	 * 幅と高さを0で初期化する
	 */
	public Sample0308_02_01() {
		w = 0;
		h = 0;
	}

	/**
	 * サイズ設定
	 * @param width 幅
	 * @param height 高さ
	 */
	public void setSize(int width, int height) {
		w = width;
		h = height;
	}

	/**
	 * 幅を取得
	 * @return 幅
	 */
	public int getWidth() {
		return w;
	}

	/**
	 * 高さを取得
	 * @deprecated 新しいメソッドを使用してください
	 * @return 高さ
	 */
	public int getHeight() {
		return h;
	}
}
