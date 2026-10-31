package lesson32;
public class Sample0302_09 {
    public static void main(String[] args) {
        // objの値を 10, null, 1.5 に変更して試してみよう
        Object obj = 100; 
        switch (obj) {
      // 以下はJava21より前の書き方 Java25ではコンパイルエラーになる
      // case Integer i && i < 10 -> System.out.println("inte < 10");
        case Integer i when i >= 100 -> System.out.println("inte >= 100");
        case Integer inte -> System.out.println("inte = " + inte);
        case null -> System.out.println("obj = null");
        default -> System.out.println("パターンアンマッチ");
        }
    }
}
