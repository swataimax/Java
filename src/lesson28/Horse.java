package lesson28;

public class Horse extends Animal implements Wing {
	void run() {
		System.out.println("走る");
	}

	public void flying() {
		System.out.println("時速" + speed + "kmで飛びます！");

	}
}
