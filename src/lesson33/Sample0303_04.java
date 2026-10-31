package lesson33;
import java.io.FileWriter;
import java.io.IOException;
public class Sample0303_04 {
    public static void main(String[] args) throws IOException {
        String ls = System.lineSeparator(); // 改行
        // コンストラクタの引数のファイルが存在しない場合、新規作成する
        FileWriter fw = new FileWriter("C:\\java\\Sample0303_04.txt"); 
        fw.write(65); // 文字コードで指定、「A」を書き込む
        fw.write(ls); // 改行を出力しないと改行されない
        fw.write("abc");
        fw.close();  // 必ずクローズすること
        System.out.println("書き込み終了");
    }
}
