package lesson26b;

public class Sample0206_04 {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.cry(); // スーパークラスのオブジェクト

		animal = new Dog();
		animal.cry(); // サブクラス(Dog)のオブジェクト

		animal = new Cat();
		animal.cry(); // サブクラス(Cat)のオブジェクト
	}
}
