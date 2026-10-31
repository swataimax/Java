package lesson32;

public class C0302Q02 {
    public static void main(String[] args) {
        BirdQ[] bird = {new Eagle(), new Owl(), new Crow()};
        for (BirdQ b : bird) {
            b.sing();
        }
    }
}
