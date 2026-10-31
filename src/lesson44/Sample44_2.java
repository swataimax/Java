package lesson44;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 条件に合致する要素の取り出し2
 */
public class Sample44_2 {
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
		List<Customer> customer = List.of(cust1, cust2, cust3);
		Sample44_2 sample = new Sample44_2();
		System.out.println(sample.getList1(customer, item2));
		System.out.println(sample.getList2(customer, item2));
		System.out.println(sample.getList3(customer, item2));
	}
	
	// 指定した製品を購入した顧客リストを作成
	// 従来の拡張for文
	List<Customer> getList1(List<Customer> customer, Item item) {
		List<Customer> list = new ArrayList<>();
		for (Customer cust : customer) {
			if (cust.getItems().contains(item)) {
				list.add(cust);
			}
		}
		return list;
	}
	
	// forEachメソッドで書き換え
	List<Customer> getList2(List<Customer> customer, Item item) {
		List<Customer> list = new ArrayList<>();
//		customer.stream()
//				.filter(cust -> cust.getItems().contains(item))
//				.forEach(cust -> list.add(cust));
		customer.stream()
				.filter(cust -> cust.getItems().contains(item))
				.forEach(list::add);	// インスタンスメソッド参照
		return list;
	}
	//                            ↑ローカル変数listにアクセスしている
	// ストリームからローカル変数へのアクセスがあるが、なるべく避けたい。
	
	// collectメソッドとCollectors.toListメソッドを使用すると
	List<Customer> getList3(List<Customer> customer, Item item) {
		List<Customer> list = customer.stream()
				.filter(cust -> cust.getItems().contains(item))
				.collect(Collectors.toList());
		return list;
	}
}


