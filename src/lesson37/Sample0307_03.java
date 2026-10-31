package lesson37;

public class Sample0307_03 {
	public static void main(String[] args) {
		Color[] cArr = Color.values();
		for (Color c : cArr) {
			System.out.println(c.ordinal() + ":" + c.toString());
		}
		Color color = Color.valueOf("RED");
		System.out.println(color);
	}
}
