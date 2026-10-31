package lesson33;
import java.io.FileReader;
import java.io.IOException;
public class Sample0303_03 {
    /* テキストのスペースの都合上、mainメソッドにthrowsを記述しているが
        あくまで学習用であり、開発現場ではやってはいけない */
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\java\\Sample.java");
        for (int c; (c = fr.read()) != -1;) { // 1文字ずつ読み込み
            System.out.print((char)c); // charでキャストする
        }
        fr.close(); //ストリームを開放したら、必ずcloseをしないといけない
    }
}
