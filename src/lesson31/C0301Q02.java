package lesson31;
import java.util.Scanner;

public class C0301Q02 {
    public static void main(String[] args) {
        try {
            Scanner scn = new Scanner(System.in);
            System.out.print("奇数を入力してください：");
            int x = scn.nextInt();
            System.out.println("奇数です：" + getNum(x));
            scn.close();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
    
    // 奇数のときは引数を返す、偶数の時は独自例外をスローする
    static int getNum(int x) throws MyException {
        if (x % 2 == 0) {
            throw new MyException("偶数は入力しないでください");
        }
        return x;
    }
}
// 独自例外クラス
class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}
