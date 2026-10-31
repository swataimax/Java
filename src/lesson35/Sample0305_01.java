package lesson35;

public class Sample0305_01 {
    public static void main(String[] args) {
        Box box1 = new Box(10);
        System.out.println((Integer) box1.get());

        Box box2 = new Box("Hello");
        System.out.println((String) box2.get());

        // 実行例外
        System.out.println((Integer) box2.get());
    }
}

//	10
//	Hello
//	Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
//		at lesson35.Sample0305_01.main(Sample0305_01.java:12)