package lesson31;
public class Sample0301_05 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            arr[10] = 10;
            System.out.println("arr[10]に代入しました");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("getMessaseメソッド：");
            System.out.println(e.getMessage());
            System.out.println("--------------------");
            System.out.println("printStackTraceメソッド：");
            e.printStackTrace();
        }
    }
}
