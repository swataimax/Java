package lesson44;

import java.util.ArrayList;
import java.util.List;

/*
 * 要素から他の情報を抽出
 */
public class Sample44_3 {
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
		
		Sample44_3 sample = new Sample44_3();
		System.out.println(sample.getNames1(custmers));
		System.out.println(sample.getNames2(custmers));
		System.out.println(sample.getNames3(custmers));
	}
	
	// 顧客リストから名前の一覧を取り出す
	// 拡張for文
	List<String> getNames1(List<Customer> customers) {
		List<String> list = new ArrayList<>();
		for (Customer cust : customers) {
			list.add(cust.getName());
		}
		return list;
	}
	
	// StreamAPIを使用して単純に書き換え
	List<String> getNames2(List<Customer> customers) {
		List<String> list = new ArrayList<>();
		customers.stream().forEach(cust -> {
			list.add(cust.getName());
		});
		return list;
	}
	
	// ストリームの要素の他の情報に変換するにはmapメソッドが使用できる
	List<String> getNames3(List<Customer> customers) {
		List<String> list = new ArrayList<>();
		customers.stream()
				.map(cust -> cust.getName())
				.forEach(name -> list.add(name));
		return list;
	}
}
