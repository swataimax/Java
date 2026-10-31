package lesson44;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 情報を抽出してから平坦化2
 */
public class Sample44_6 {
	public static void main(String[] args) {
		Item item1 = new Item(11, "item1", 100);
		Item item2 = new Item(12, "item2", 110);
		Item item3 = new Item(13, "item3", 200);
		Customer cust1 = new Customer(1, "name1", "area1", List.of(item1, item2));
		Customer cust2 = new Customer(2, "name2", "area2", List.of(item1, item3));
		Customer cust3 = new Customer(3, "name3", "area1", List.of(item2, item3));
		List<Customer> custmers = List.of(cust1, cust2, cust3);

		Sample44_6 sample = new Sample44_6();
		System.out.println(sample.getFlat4(custmers, item2));
		System.out.println(sample.getFlat5(custmers, item2));
	}
	
	// ストリームで重複要素を削除するにはdistinctメソッドを使用する
	List<Item> getFlat4(List<Customer> customers, Item item) {
		List<Item> list = new ArrayList<>();
		customers.stream()
				.flatMap(cust -> cust.getItems().stream())
				.distinct()
				.forEach(i -> list.add(i));
		list.sort((i1, i2) -> Integer.compare(i1.getId(), i2.getId()));
		return list;
	}
	
	// 更にcollectメソッドを使用すると次のようにすることができる
	// またsortedメソッドの引数にComparatorを設定することにより、listをソートする
	List<Item> getFlat5(List<Customer> customers, Item item) {
		List<Item> list = customers.stream()
				.flatMap(cust -> cust.getItems().stream())
				.distinct()
				.sorted((i1, i2) -> Integer.compare(i1.getId(), i2.getId()))
				.collect(Collectors.toList());
		return list;
	}
}
