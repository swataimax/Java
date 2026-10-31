package lesson26b;

public class Sample0206_05 {
	public static void main(String[] args) {
		Animal[] animals = { new Animal(), new Dog(), new Cat() };
		for (Animal animal : animals) {
			animal.cry();
		}
	}
}
