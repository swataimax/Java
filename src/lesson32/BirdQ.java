package lesson32;

public sealed interface BirdQ permits Eagle, Owl, Crow {
    public abstract void sing();
}

final class Eagle implements BirdQ {
    public void sing() {
        System.out.println("ワシ：ピィー");
    }
}
final class Owl implements BirdQ {
    public void sing() {
        System.out.println("フクロウ：ホー、ホー");
    }
}
final class Crow implements BirdQ {
    public void sing() {
        System.out.println("カラス：カー、カー");
    }
}
