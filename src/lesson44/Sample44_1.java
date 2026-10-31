package lesson44;

import java.util.List;

/*
 * 条件に合致する要素の取り出し1
 */
public class Sample44_1 {
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

		Sample44_1 sample = new Sample44_1();
		sample.print1(customer, item2);
//		print1(customer, item2);
		System.out.println();
		sample.print2(customer, item2);
		System.out.println();
		sample.print3(customer, item2);
	}

	// Customerのリストから指定された商品を購入した顧客を抽出
	// 従来の拡張for文で
	void print1(List<Customer> customer, Item item) {
//	static void print1(List<Customer> customer, Item item) {
		for (Customer cust : customer) {
			if (cust.getItems().contains(item)) {
				System.out.println(cust);
			}
		}
	}
	
	// forEachメソッドを使用して単純に書き換え
	void print2(List<Customer> customer, Item item) {
		customer.forEach(cust -> {
			if (cust.getItems().contains(item)) {
				System.out.println(cust);
			}
		});
		
		customer.stream().forEach(cust -> {			// streamにしてもOK
			if (cust.getItems().contains(item)) {
				System.out.println(cust);
			}
		});
	}
	
	// elseのないif文はfilterメソッドで置き換えることができる
	void print3(List<Customer> customer, Item item) {
		customer.stream()
				.filter(cust -> cust.getItems().contains(item))
				.forEach(cust -> System.out.println(cust));
		
		customer.stream()
		.filter(cust -> cust.getItems().contains(item))
		.forEach(System.out::println);		// メソッド参照
		
	}
}

//filterメソッドは中間操作なので、終端操作であるforEachメソッドの前に記述
//filterメソッドの引数のラムダ式はif文の条件の内容をそのまま記述
//filterメソッドによりストリームは変数itemを購入した顧客だけになる
