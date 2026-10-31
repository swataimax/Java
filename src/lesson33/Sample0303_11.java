package lesson33;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
public class Sample0303_11 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\java\\charset.txt";
        Charset cs = Charset.forName("UTF-8");
        try (OutputStreamWriter osw = new OutputStreamWriter(
        		new FileOutputStream(path),cs)) {
            osw.write("あいうえお");
        }
        System.out.println("処理終了");
    }
}
