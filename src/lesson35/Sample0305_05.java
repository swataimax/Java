package lesson35;
import java.util.ArrayList;
import java.util.List;

public class Sample0305_05 {
    public static void main(String[] args) {
        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog());
        show(dogList); // コンパイルエラー
    }
    static void show(List<Animal> list) {
        for (Animal a : list) {
            a.cry();
        }
    }
}
