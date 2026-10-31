package lesson44;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * （参考）要素を平坦化して集計
 */
public class Sample44_8 {
	public static void main(String[] args) {
		Item item1 = new Item(11, "item1", 100);
		Item item2 = new Item(12, "item2", 110);
		Item item3 = new Item(13, "item3", 200);
		Customer cust1 = new Customer(1, "name1", "area1", List.of(item1, item2));
		Customer cust2 = new Customer(2, "name2", "area2", List.of(item1, item3));
		Customer cust3 = new Customer(3, "name3", "area1", List.of(item2, item3));
		List<Customer> custmers = List.of(cust1, cust2, cust3);

		Sample44_8 sample = new Sample44_8();
		System.out.println(sample.getIMap1(custmers));
		System.out.println(sample.getIMap2(custmers));
		System.out.println(sample.getIMap3(custmers));
	}
	
	// 製品の売れた数をカウントする
	// 従来の記述方法
	Map<Item, Long> getIMap1(List<Customer> customers) {
//		Map<Item, Long> itemCounts = new HashMap<>();
		Map<Item, Long> itemCounts = new LinkedHashMap<>();
		for (Customer cust : customers) {
			List<Item> list = cust.getItems();
			for (Item item : list) {
				long count = itemCounts.getOrDefault(item, 0L);
				itemCounts.put(item, count + 1);
			}
		}
		return itemCounts;
	}
	
	// StreamAPIを使用して単純に書き換え
	Map<Item, Long> getIMap2(List<Customer> customers) {
//		Map<Item, Long> itemCounts = new HashMap<>();
		Map<Item, Long> itemCounts = new LinkedHashMap<>();
		customers.stream()
				.flatMap(cust -> cust.getItems().stream())
				.forEach(item -> {
					long count = itemCounts.getOrDefault(item, 0L) + 1;
					itemCounts.put(item, count);
				});
		return itemCounts;
	}
	
	// 更に製品ごとの集計はオブジェクトを数えることと同じなので、
	// groupingByメソッドとcountingメソッドを使用して次にようにすることもできる
	Map<Item, Long> getIMap3(List<Customer> customers) {
		Map<Item, Long> itemCounts = customers.stream()
				.flatMap(cust -> cust.getItems().stream())
				.collect(Collectors.groupingBy(
						item -> item, Collectors.counting()));
		return itemCounts;
	}
}

//{11 - item1 - 100=2, 12 - item2 - 110=2, 13 - item3 - 200=2}
//{11 - item1 - 100=2, 12 - item2 - 110=2, 13 - item3 - 200=2}
//{12 - item2 - 110=2, 11 - item1 - 100=2, 13 - item3 - 200=2}


