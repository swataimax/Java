package lesson43;

import java.util.Optional;
/*
 * Optional
 */
public class Sample43_22 {
	public static void main(String[] args) {
		Optional<Person> person = Optional.of(new Person("山田", "太郎"));
		person.map(p -> p.getLast())
				.ifPresent(System.out::println);
		Optional<Person> p1 = Optional.of(new Person("佐藤", "次郎"));
		Optional<Person> p2 = Optional.of(new Person("田中", "三郎"));
		Optional<Pair> pair;
		
		if (p1.isPresent() && p2.isPresent()) {
			pair = Optional.of(new Pair(p1.get(), p2.get()));
		} else {
			pair = Optional.empty();
		}
		System.out.println(pair.get());
		
		// flatMapメソッドで書き換え
		pair = p1.flatMap(p -> p2.flatMap(
				q -> Optional.of(new Pair(p, q))));
		System.out.println(pair.get());
		
	}
}