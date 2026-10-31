package lesson32;

public class Sample0302_07 {
    public static void main(String[] args) {
        Object obj = 100;  // else if文とパターンマッチする
//         Object obj = "Hello"; // if文とパターンマッチする
//         Object obj = 1.5;  // else文
        if (obj instanceof Integer inte) {
            System.out.println("Integer：" + (inte + 1));
        } else if (obj instanceof String str) {
            System.out.println("String：" + str.toUpperCase());
        } else {
            System.out.println("パターンアンマッチ");
        }
    }
}
