package lesson26b;

public class Sample0206_03 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.cry();
		Animal animal = new Dog(); // サブクラスのオブジェクト
		animal.cry();
	}
}
