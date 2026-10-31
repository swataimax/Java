package lesson39;

import java.util.ArrayList;
import java.util.List;

public class Sample0309_02 {
	public static void main(String[] args) {
		List<String> animalList = List.of("Dog", "Cat", "Lion");
		List<String> birdList = List.of("Sparrow", "Crow", "Owl");
		List<List<String>> creatureList = new ArrayList<List<String>>();
		// ダイヤモンド演算子も記述可能
		//List<List<String>> creatureList = new ArrayList<>();

		creatureList.add(animalList); // 二次元リストにリストを追加
		creatureList.add(birdList); // 二次元リストにリストを追加

		for (List<String> list : creatureList) {
			for (String str : list) {
				System.out.print(str + " ");
			}
			System.out.println();
		}
	}
}
