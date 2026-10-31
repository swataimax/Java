package lesson28;

public class Sample0208_15 {
	public static void main(String[] args) {
		Animal animal = new Horse();
		System.out.println("Animal:" + (animal instanceof Animal));
		System.out.println("Horse:" + (animal instanceof Horse));
		// animal.run(); // Horseクラスにキャストが必要
		((Horse) animal).run(); // Horseクラスのメソッド

		Wing wing = new Horse();
		System.out.println("Wing:" + (wing instanceof Wing));
		System.out.println("Horse:" + (wing instanceof Horse));
		// wing.run(); // Horseクラスにキャストが必要
		((Horse) wing).run(); // Horseクラスのメソッド

		// Animal a = (Lion)animal; // 実行時エラー
	}
}
