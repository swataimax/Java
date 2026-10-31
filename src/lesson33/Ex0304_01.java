package lesson33;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex0304_01 {
    public static void main(String[] args) throws IOException {
        String srcPath = "C:\\java\\onigiri.png";
        String dstPath = "C:\\java\\onigiriCopyEx.png";
      
        // スコープの関係上、tryブロックの外で変数宣言をしておく
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // オブジェクト生成はtryブロックの中で行う
            fis = new FileInputStream(srcPath);
            fos = new FileOutputStream(dstPath);

            for (int b; (b = fis.read()) != -1;) {
                fos.write(b);
            }

        } catch (IOException e) {
            System.err.println(e);
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
            }
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
            }
        }
        System.out.println("処理終了");
    }
}
