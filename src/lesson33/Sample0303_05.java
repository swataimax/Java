package lesson33;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Sample0303_05 {
    public static void main(String[] args) throws IOException {
        String srcPath = "C:\\java\\Sample.java"; // コピー元
        String destPath = "C:\\java\\SampleCopy.java"; // コピー先
        FileReader fr = new FileReader(srcPath);
        FileWriter fw = new FileWriter(destPath);
        for (int c; (c = fr.read()) != -1;) { // ファイル読み込み
            fw.write((char)c); // ファイル書き込み
        }
        fr.close();
        fw.close();
        System.out.println("書き込み終了");
    }
}
