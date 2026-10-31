package lesson37;

public class C0307Q01 {
	public static void main(String[] args) {
		for (Size s : Size.values()) {
			System.out.println(s);
		}
	}
}

enum Size {
	SMALL, MIDDLE, LARGE
}
