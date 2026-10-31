package lesson35;
import java.util.ArrayList;
import java.util.List;
public class Sample0305_07 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        showList(list);
    }
    static void showList(List<?> list) {
        for (Object item : list) { // Object型以外設定不可
            System.out.println(item);
        }
        //list.add("abc"); // 型が決まっていないので値の設定不可
        list.add(null); // nullは設定可能
    }
}
