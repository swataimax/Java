package lesson32;

public class Sample0302_03 {
    public static void main(String[] args) {
        Student2 st = new Student2(1, "山田太郎"); // ①
//        Student2 st = new Student2(-1, "山田太郎"); // ②
//        Student2 st = new Student2(1, ""); // ③
        
        System.out.println(st.id() + ", " + st.name());
    }
}
