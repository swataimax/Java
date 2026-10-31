package lesson37;

public class Sample0307_05 {
	public static void main(String[] args) {
		for (Fruits2 f : Fruits2.values()) {
			System.out.println(f.getName());
		}
	}
}

enum Fruits2 {
	APPLE("リンゴ"), ORANGE("オレンジ"), MELON("メロン");

	private String name;

	Fruits2(String name) {
		this.name = name;
	}

	String getName() {
		return this.name;
	}
}
