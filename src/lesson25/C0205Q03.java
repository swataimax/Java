package lesson25;

import lesson25x.Circle;
import lesson25x.Square;

public class C0205Q03 {
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.areaCalculation(5);
		System.out.println(circle.area);

		Square square = new Square();
		square.areaCalculation(5);
		System.out.println(square.area);

	}
}
