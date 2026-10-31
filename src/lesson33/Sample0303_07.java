package lesson33;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sample0303_07 {
    public static void main(String[] args) throws IOException {
        String srcPath = "C:\\java\\Sample.java";
        String dstPath = "C:\\java\\SampleBwCopy.java";
        BufferedReader br = new BufferedReader(new FileReader(srcPath));
        BufferedWriter bw = new BufferedWriter(new FileWriter(dstPath));
        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
        }
        br.close();
        bw.close();
        System.out.println("処理終了");
    }
}
