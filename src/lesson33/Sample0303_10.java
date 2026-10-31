package lesson33;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample0303_10 {
//    public static void main(String[] args) throws IOException {
    public static void main(String[] args) {
        String srcPath = "C:\\java\\onigiri.png";
        String dstPath = "C:\\java\\onigiriBwCopy2.png";
        
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcPath));
        		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dstPath));) {
        	for (int b; (b = bis.read()) != -1;) {
        		bos.write(b);
        	}
//        } // ここまでがtry-with-resourcesの処理
        } catch(IOException e) {	// throwsをしなければ、try-catchする必要あり
        	e.printStackTrace();
        }
        System.out.println("処理終了");
    }
}
