package lesson44;

public class Item {
	private int id;
	private String name;
	private int price;

	Item(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return id + " - " + name + " - " + price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
}
