package lesson26;

public class Dog extends Animal {
	int size = 150;

	public void cry() {
		System.out.println("size = " + super.size);
		super.cry();
		System.out.println("ワンワン");
	}

	public void dogWalking() {
		System.out.println("お散歩");
		super.cry();
	}
}
