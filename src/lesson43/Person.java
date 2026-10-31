package lesson43;

public class Person {
	private String first;
	private String last;

	public Person(String first, String last) {
		this.first = first;
		this.last = last;
	}

	@Override
	public String toString() {
		return first + last;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String fisrt) {
		this.first = fisrt;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
}