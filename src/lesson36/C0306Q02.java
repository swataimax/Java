package lesson36;
public class C0306Q02 {
    public static void main(String[] args) {
        System.out.println(concat("abc", "def"));
        System.out.println(concat("123", "456", "789"));
        
    }
    static String concat(String... s) {
        String concat = "";
        for (String str : s) {
            concat += str;
        }
        return concat;
    }
}
