package lesson33;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Sample0303_06 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\java\\Sample.java";
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line;
        while ((line = br.readLine()) != null) { // 1行読み込み
            System.out.println(line);
        }
        br.close();
    }
}
