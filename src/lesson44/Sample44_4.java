package lesson44;

import java.util.List;
import java.util.stream.Collectors;

public class Sample44_4 {
	public static void main(String[] args) {
		Item item1 = new Item(11, "item1", 100);
		Item item2 = new Item(12, "item2", 110);
		Item item3 = new Item(13, "item3", 200);
		Customer cust1 = new Customer(
				1, "name1", "area1", List.of(item1, item2));
		Customer cust2 = new Customer(
				2, "name2", "area2", List.of(item1, item3));
		Customer cust3 = new Customer(
				3, "name3", "area1", List.of(item2, item3));
		List<Customer> custmers = List.of(cust1, cust2, cust3);
		System.out.println(custmers);
		
		Sample44_4 sample = new Sample44_4();
		System.out.println(sample.getNamesList(custmers));
		System.out.println(sample.getNamesSort(custmers));
		System.out.println(sample.getNamesFilter(custmers, item2));
	}
	
	// 更にリストへ変換するのであればcollectメソッドとCollectors.toListメソッドを使用できる
	List<String> getNamesList(List<Customer> customers) {
		List<String> list = customers.stream()
				.map(cust -> cust.getName())
				.collect(Collectors.toList());
		return list;
	}
	
	// 更に名前を自然順序付けで整列する場合、sortedメソッドを使用する
	List<String> getNamesSort(List<Customer> customers) {
		List<String> list = customers.stream()
				.map(cust -> cust.getName())
				.sorted()
				.collect(Collectors.toList());
		return list;
	}
	
	// 更に特定の製品を購入した顧客に絞るにはfilterメソッドを使用する
	// 名前を自然順序付けで整列する場合、sortedメソッドを使用する
	List<String> getNamesFilter(
			List<Customer> customers, Item item) {
		List<String> list = customers.stream()
				.filter(cust -> cust.getItems().contains(item))
				.map(cust -> cust.getName()).sorted()
				.collect(Collectors.toList());
		return list;
	}
}
