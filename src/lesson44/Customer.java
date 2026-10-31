package lesson44;

import java.util.List;

public class Customer {
	private int id;
	private String name;
	private String area;
	private List<Item> items;

	Customer(int id, String name,
			String area, List<Item> items) {
		this.id = id;
		this.name = name;
		this.area = area;
		this.items = items;
	}

	@Override
	public String toString() {
		return id + " : " + name + " : " + area;
	}

	public String getName() {
		return name;
	}

	public String getArea() {
		return area;
	}

	public List<Item> getItems() {
		return items;
	}
}
