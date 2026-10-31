package lesson37;

public class Sample0307_02 {
	public static void main(String[] args) {
		// BLUE, YELLOWに変更して実行してみよう
		Color c = Color.RED;

		// if文
		if (c == Color.RED) {
			System.out.println("赤");
		} else {
			System.out.println("赤以外");
		}

		// switch文        
		switch (c) {
		case Color.RED: // 「case RED」:でも動作する
			System.out.println("赤");
			break;
		case Color.BLUE:
			System.out.println("青");
			break;
		default:
			System.out.println("赤青以外");
		}
	}
}
