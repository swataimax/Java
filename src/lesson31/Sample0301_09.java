package lesson31;
import java.util.Scanner;
public class Sample0301_09 {
    public static void main(String[] args) {
        try {
            Scanner scn = new Scanner(System.in);
            System.out.print("誕生月を入力してください：");
            int month = scn.nextInt();
            if (month < 1 || month > 12) {
                throw new BusinessException();
            }
            System.out.println("誕生月は" + month + "月です");
        } catch (BusinessException e) {
            System.out.println("1から12の間で入力してください");
        }
    }
}

class BusinessException extends Exception {
    // 中身は空
}

