package lesson43;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class C43Q3 {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person("山田", "太郎"));
		list.add(new Person("佐藤", "次郎"));
		list.add(new Person("田中", "三郎"));
		list.add(new Person("佐藤", "四郎"));
		list.add(new Person("加藤", "五郎"));
		System.out.println(list); // リストの中身を確認
		
		List<Person> resultList = list.stream()
				.filter(x -> x.getFirst().equals("佐藤"))
				.collect(Collectors.toList());
		System.out.println(resultList); // リストの中身を確認
	}
}
