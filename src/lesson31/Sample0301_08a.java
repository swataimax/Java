package lesson31;
public class Sample0301_08a {
    public static void main(String[] args) {
        hello();
    }
    static void hello() {
        throw new Exception(); // ここでコンパイルエラーが発生
    }
}
