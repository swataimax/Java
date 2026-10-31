package lesson31;
public class Sample0301_06 {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {
        	System.out.println("Exceptionがスローされた");
        }
    }
}

