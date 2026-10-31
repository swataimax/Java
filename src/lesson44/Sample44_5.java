package lesson44;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
 * 情報を抽出してから平坦化
 */
public class Sample44_5 {
	public static void main(String[] args) {
		Item item1 = new Item(11, "item1", 100);
		Item item2 = new Item(12, "item2", 110);
		Item item3 = new Item(13, "item3", 200);
		Customer cust1 = new Customer(1, "name1", "area1", List.of(item1, item2));
		Customer cust2 = new Customer(2, "name2", "area2", List.of(item1, item3));
		Customer cust3 = new Customer(3, "name3", "area1", List.of(item2, item3));
		List<Customer> custmers = List.of(cust1, cust2, cust3);
		
		Sample44_5 sample = new Sample44_5();
		System.out.println(sample.getFlat1(custmers, item2));
		System.out.println(sample.getFlat2(custmers, item2));
		System.out.println(sample.getFlat3(custmers, item2));
	}
	
	// 購入された製品の一覧を抽出し、製品番号で整列を行う
	// StreamAPIやラムダ式を使用しない従来のコード
	List<Item> getFlat1(List<Customer> customers, Item item) {
		List<Item> list = new ArrayList<>();
		for (Customer cust : customers) {
			List<Item> items = cust.getItems();
			for (Item i : items) {
				if (!list.contains(i)) {
					list.add(i);
				}
			}
		}

		list.sort(new Comparator<Item>() {
			public int compare(Item i1, Item i2) {
				return Integer.compare(i1.getId(), i2.getId());
			}
		});
		return list;
	}
	
	// StreamAPIとforEachメソッドを使用して書き換える
	List<Item> getFlat2(List<Customer> customers, Item item) {
		List<Item> list = new ArrayList<>();
		customers.stream().forEach(cust -> {
			cust.getItems().stream().forEach(i -> {
				if (!list.contains(i)) {
					list.add(i);
				}
			});
		});
		list.sort((i1, i2) -> Integer.compare(i1.getId(), i2.getId()));
		return list;
	}
	
	// 更にflatMapを使用して平坦化を行い、繰り返しを1つ消去する
	List<Item> getFlat3(List<Customer> customers, Item item) {
		List<Item> list = new ArrayList<>();
		customers.stream()
				.flatMap(cust -> cust.getItems().stream())
				.forEach(i -> {
					if (!list.contains(i)) {
						list.add(i);
					}
				});
		list.sort((i1, i2) -> Integer.compare(i1.getId(), i2.getId()));
		return list;
	}
}
