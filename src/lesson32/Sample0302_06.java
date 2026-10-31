package lesson32;

public class Sample0302_06 {
    public static void main(String[] args) {
        Object obj = "Hello";
        // Java15以前
        if (obj instanceof String) {
            String str = (String)obj;
            System.out.println("Java15以前：" + str.toUpperCase());
        }
        // Java16以降
        if (obj instanceof String str) {
            System.out.println("Java15以降：" + str.toUpperCase());
        }
    }
}
