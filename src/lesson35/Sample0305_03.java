package lesson35;

import java.util.ArrayList;
import java.util.List;

public class Sample0305_03 {
    public static void main(String[] args) {
        List<Integer> list1 = getList(100);
        System.out.println("list1:" + list1);
        
        List<String> list2 = getList("Hello");
        System.out.println("list2:" + list2);
        
        // コンパイルエラー
        //List<Integer> list3 = getList("World");
    }
    
    static <T> List<T> getList(T t) {
        List<T> list = new ArrayList<>();
        list.add(t);
        return list;
    }
}
