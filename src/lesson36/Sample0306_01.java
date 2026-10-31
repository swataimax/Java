package lesson36;
public class Sample0306_01 {
    public static void main(String[] args) {
        hello(1, 2, 3);
        hello(10);
        hello(); // 引数を渡さない
    }
    static void hello(int... a) {
        System.out.println("引数の数：" + a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
