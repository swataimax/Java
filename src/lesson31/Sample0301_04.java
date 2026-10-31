package lesson31;
import java.util.Scanner;
public class Sample0301_04 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            System.out.println("配列の要素数は3です");
            Scanner scn = new Scanner(System.in);
            System.out.print("インデックスを入力してください：");
            int x = scn.nextInt(); // 例外が発生する可能性あり(cパターン)
            arr[x] = 10; // 例外が発生する可能性あり(bパターン)
            System.out.println("arr[" + x + "]に代入しました");
            scn.close();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                    "ArrayIndexOutOfBoundsExceptionが発生");
        } finally {
            System.out.println("finally実行");
        }
        System.out.println("処理終了");
    }
}
