package lesson32;

public class Sample0302_04 {
    public static void main(String[] args) {
        Student3 st = new Student3(2, "佐藤次郎"); // ①
        // Student3 st = new Student3(-2, "佐藤次郎"); // ②
        // Student3 st = new Student3(2, ""); // ③
        
        System.out.println(st.id() + ", " + st.name());
    }
}
