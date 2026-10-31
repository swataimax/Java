package lesson35;

public class Sample0305_02 {
    public static void main(String[] args) {
        Box2<Integer> box1 = new Box2<Integer>(10);
        System.out.println(box1.get()); // キャストは不要になる
        
        Box2<String> box2 = new Box2<String>("Hello");
        System.out.println(box2.get()); // キャストは不要になる

        Box2<String> box4 = new Box2<>("Hello"); //型推論
        System.out.println(box4.get()); // キャストは不要になる

        // コンパイルエラーになる
        //Box2<Integer> box3 = new Box2<Integer>("Thankyou");
    }
}
