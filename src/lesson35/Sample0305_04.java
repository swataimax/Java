package lesson35;
import java.util.ArrayList;
import java.util.List;
public class Sample0305_04 {
    public static void main(String[] args) {
        // 上限のAnimalなのでOK
        List<? extends Animal> list1 = new ArrayList<Animal>();
        // AnimalクラスのサブクラスなのでOK
        List<? extends Animal> list2 = new ArrayList<Dog>();

        // 上限を越えたスーパークラスなのでNG
        //List<? extends Animal> list3 = new ArrayList<Creature>();

        // Animalクラスと継承関係にないクラスなのでNG
        //List<? extends Animal> list4 = new ArrayList<Integer>();
    }
}
