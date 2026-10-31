package lesson31;
import java.util.Scanner;
public class C0301Q01 {
    public static void main(String[] args) {
        try {
            Scanner scn = new Scanner(System.in);
            System.out.print("10を割る値を入力してください：");
            int x = scn.nextInt();
            int sum = 10 / x;
            System.out.println(sum);
            scn.close();
        } catch (ArithmeticException e) {
            System.out.println("0除算は禁止です");
        }
    }
}
