package lesson33;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample0303_09 {
    public static void main(String[] args) throws IOException {
        String srcPath = "C:\\java\\onigiri.png";
        String dstPath = "C:\\java\\onigiriBwCopy.png";
        
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcPath));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dstPath));
        
        for (int b; (b = bis.read()) != -1;) {
            bos.write(b);
        }
        bis.close();
        bos.close();
        System.out.println("処理終了");
    }
}
