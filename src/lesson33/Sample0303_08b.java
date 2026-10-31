package lesson33;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Sample0303_08b {
    public static void main(String[] args) throws IOException {
        String srcPath = "C:\\java\\onigiri.png";
        String dstPath = "C:\\java\\onigiriCopy2.png";
        FileInputStream fis = new FileInputStream(srcPath);
        FileOutputStream fos = new FileOutputStream(dstPath);
        byte[] b = fis.readAllBytes();
        fos.write(b);
        fis.close();
        fos.close();
        System.out.println("処理終了");
    }
}
