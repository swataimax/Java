package lesson37;

public class Sample0307_04 {
	public static void main(String[] args) {
		for (Fruits f : Fruits.values()) {
			System.out.println(f.getOrdinal() + ":" + f);
		}
	}
}

enum Fruits {
	APPLE, ORANGE, MELON; // セミコロンをつける

	private int oridinal;

	Fruits() {
		oridinal = ordinal();
	}

	int getOrdinal() {
		return oridinal;
	}
}
