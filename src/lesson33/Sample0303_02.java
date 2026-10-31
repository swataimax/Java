package lesson33;
import java.io.File;
public class Sample0303_02 {
    public static void main(String[] args) {
        File file = new File("C:\\pleiades");
        String[] dirList = file.list();
        for (String str : dirList) {
            System.out.println(str);
        }
        // ディレクトリ作成
        File file2 = new File("C:\\java");
        file2.mkdir();
    }
}
