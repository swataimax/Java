package lesson33;
import java.io.File;
import java.util.Date;
public class Sample0303_01 {
    public static void main(String[] args) {
        /* コンストラクタ引数のファイルパスに指定したファイルがオブジェクト化される
         　→ Javaプログラムでファイルの操作ができるようになる */
        File file = new File("C:\\Sample.java");
        System.out.println("ファイルの存在：" + file.exists());
        System.out.println("絶対パス：" + file.getAbsolutePath());
        System.out.println("ファイル名：" + file.getName());
        System.out.println("ファイルサイズ：" + file.length());
        System.out.println("最終更新日時：" + new Date(file.lastModified()));
    }
}
