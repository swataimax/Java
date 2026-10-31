package lesson31;
import java.util.Scanner;
public class Sample0301_10 {
    public static void main(String[] args) {
        try {
            Scanner scn = new Scanner(System.in);
            System.out.print("誕生月を入力してください：");
            int month = scn.nextInt();
            if (month < 1 || month > 12) {
                throw new BusinessException2
                                                ("1から12の間で入力してください");
            }
            System.out.println("誕生月は" + month + "月です");
        } catch (BusinessException2 e) {
            System.out.println("メッセージ：" + e.getMessage());
        }
    }
}

class BusinessException2 extends Exception {
    BusinessException2(String msg) {
        // Exceptionクラスのコンストラクタに引数を渡して詳細メッセージにセットする
        super(msg);
    }
}
