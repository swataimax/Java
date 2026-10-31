package lesson35;
import java.util.ArrayList;
import java.util.List;

public class Sample0305_05b {
    public static void main(String[] args) {
        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog());
        show(dogList);
    }
    static void show(List<? extends Animal> list) {
        for (Animal a : list) {
            a.cry();
        }
    }
}
