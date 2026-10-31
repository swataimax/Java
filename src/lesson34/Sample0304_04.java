package lesson34;
import java.util.HashSet;
import java.util.Set;
public class Sample0304_04 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("あいうえお");
        set.add("あいうえお"); // 重複行
        set.add("かきくけこ");
        set.add("さしすせそ");
        set.add("たちつてと");
        set.add("なにぬねの");
        
        for (String str : set) {
            System.out.println(str);
        }
    }
}
