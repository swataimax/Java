package lesson31;
public class Sample0301_07 {
    public static void main(String[] args) {
        try {
            throw new Exception(
                            "Sample0301_07で例外が発生しました");
        } catch (Exception e) {
            System.out.println("getMessageメソッド：");
            System.out.println(e.getMessage());
            System.out.println("---------------");
            System.out.println("printStackTraceメソッド：");
            e.printStackTrace();
        }
    }
}
