package lesson31;
public class Sample0301_08c {
    public static void main(String[] args) {
        try {
            hello();
        } catch (Exception e) {
        }
    }
    static void hello() throws Exception {
        throw new Exception();
    }
}
