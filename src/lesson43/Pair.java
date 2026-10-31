package lesson43;

public class Pair {
	Person p1;
	Person p2;

	Pair(Person p1, Person p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	@Override
	public String toString() {
		return p1 + ":" + p2;
	}
}