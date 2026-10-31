package lesson35;
public class C0305Q02 {
    public static void main(String[] args) {
        System.out.println(getT(123));
        System.out.println(getT("abc"));
    }
    static <T> T getT(T t) {
        return t;
    }
}
