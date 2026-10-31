package lesson37;

public class C0307Q02 {
	public static void main(String[] args) {
		for (Size2 s : Size2.values()) {
			System.out.println(s + ":" + s.getName());
		}
	}
}

// SizeはC0307Q01ですでに作ってあったので、Size2にする
enum Size2 {
	SMALL("小"), MIDDLE("中"), LARGE("大");

	private String name;

	Size2(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
