package lesson35;
import java.util.ArrayList;
import java.util.List;

public class Sample0305_06 {
    public static void main(String[] args) {
        // 下限のAnimalなのでOK
        List<? super Animal> list1 = new ArrayList<Animal>();
        // AnimalクラスのスーパークラスなのでOK
        List<? super Animal> list2 = new ArrayList<Creature>();
        // 下限を越えたサブクラスなのでNG
        //List<? super Animal> list3 = new ArrayList<Dog>();
        // Animalクラスと継承関係にないクラスなのでNG
        //List<? super Animal> list4 = new ArrayList<Integer>();
    }
}
