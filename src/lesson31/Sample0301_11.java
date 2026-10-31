package lesson31;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Sample0301_11 {
    void hello() throws IOException {}
}
class Sub1 extends Sample0301_11 {
    void hello() throws FileNotFoundException {}   // サブクラスの例外をスロー
}
class Sub2 extends Sample0301_11 {
    void hello() {}    // 例外のスローをしない
}
class Sub3 extends Sample0301_11 {  // コンパイルエラー
    void hello() throws Exception {} // スーパークラスの例外をスロー
}
class Sub4 extends Sample0301_11 {  // コンパイルエラー
    void hello() throws InterruptedException {}
}
