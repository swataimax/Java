package lesson33;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Sample0303_08 {
    public static void main(String[] args) throws IOException {
        String srcPath = "C:\\java\\onigiri.png"; // コピー元
        String dstPath = "C:\\java\\onigiriCopy.png"; // コピー先
        FileInputStream fis = new FileInputStream(srcPath);
        FileOutputStream fos = new FileOutputStream(dstPath);       
        for (int b; (b = fis.read()) != -1;) {
            fos.write(b);
        }
        fis.close();
        fos.close();
        System.out.println("処理終了");
    }
}
