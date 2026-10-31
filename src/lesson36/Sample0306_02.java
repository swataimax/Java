package lesson36;
public class Sample0306_02 {
    public static void main(String[] args) {
        hello(1, 3.0, "山田", "佐藤", "田中");
        hello(10, 1.5, "近藤");

        String[] arr = {"abc", "efg", "hij"};
        hello(2, 0.1, arr); // 可変長引数に配列変数を渡せる
    }
    static void hello(int a, double b, String... s) {
        System.out.println("引数の数：" + s.length);
        for (String str : s) {
            System.out.println(str);
        }
    }
}
