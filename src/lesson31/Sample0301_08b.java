package lesson31;
public class Sample0301_08b {
    public static void main(String[] args) {
        hello(); // メソッド呼び出し元でtry-catchしていないため、コンパイルエラー
    }
    static void hello() throws Exception {
        throw new Exception();
    }
}
