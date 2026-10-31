package lesson26;

public class Sample0206_02 {
	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.cry();
		((Dog) animal).dogWalking();
	}
}
