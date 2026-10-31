package lesson28;

public interface PC {
	default void print() {
		System.out.println("PC");
	}
}

//defaultメソッドはアクセス修飾子は暗黙的にpublicとなる
