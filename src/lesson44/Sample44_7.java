package lesson44;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * 要素のグループ化
 */
public class Sample44_7 {
	public static void main(String[] args) {
		Item item1 = new Item(11, "item1", 100);
		Item item2 = new Item(12, "item2", 110);
		Item item3 = new Item(13, "item3", 200);
		Customer cust1 = new Customer(1, "name1", "area1", List.of(item1, item2));
		Customer cust2 = new Customer(2, "name2", "area2", List.of(item1, item3));
		Customer cust3 = new Customer(3, "name3", "area1", List.of(item2, item3));

		List<Customer> custmers = List.of(cust1, cust2, cust3);
		Sample44_7 sample = new Sample44_7();
		System.out.println(sample.getCMap1(custmers));
		System.out.println(sample.getCMap2(custmers));
		System.out.println(sample.getCMap3(custmers));
	}
	
	// 指定したルールに基づいて、顧客をグループ化する
	// 地域別の顧客リストを作成
	Map<String, List<Customer>> getCMap1(
			List<Customer> customers) {
		Map<String, List<Customer>> cmap = new HashMap<>();
		for (Customer cust : customers) {
			String area = cust.getArea();
			List<Customer> areaList = cmap.getOrDefault(area, new ArrayList<>());
			areaList.add(cust);
			cmap.put(area, areaList);
		}
		return cmap;
	}
	// 上記例ではgetOrDefaultメソッドを使用している。
	// このメソッドは第1引数の値がない場合、第2引数を返す。
	
	// StreamAPIに置き換える
	// StreamAPIではグループ化するためにcollectメソッドとgroupingByメソッドが用意されている
	Map<String, List<Customer>> getCMap2(
			List<Customer> customers) {
		Map<String, List<Customer>> cmap = customers.stream()
				.collect(Collectors.groupingBy(cust -> cust.getArea()));
		return cmap;
	}
	
	// groupingByメソッドで値に対する処理を第2引数に追加することもできる。
	// 地域ごとに顧客数のリストを生成している。
	Map<String, Long> getCMap3(List<Customer> customers) {
		Map<String, Long> cmap = customers.stream()
				.collect(Collectors.groupingBy(cust -> cust.getArea(),
						Collectors.counting()));
		return cmap;
	}
}
