package lesson32;
public class Sample0302_08 {
    public static void main(String[] args) {
        Object obj = 100; // objの値をHelloや1.5で試してみよう
        
        switch (obj) {
        case Integer inte -> System.out.println(inte + 1);
        case String str -> System.out.println(str.toUpperCase());
        default -> System.out.println("パターンアンマッチ");
        }
    }
}
