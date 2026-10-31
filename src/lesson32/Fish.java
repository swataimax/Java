package lesson32;

public sealed interface Fish permits Tuna, Salmon, Sardine{
    public abstract void swim(); 
}
// BluefinTunaクラスに継承を許可
sealed class Tuna implements Fish permits BluefinTuna { // 鮪
    @Override
	public void swim() {
        System.out.println("Tuna 泳ぐ");
    }
}
final class BluefinTuna extends Tuna { // 本マグロ
	@Override
    public void swim() {
        System.out.println("BluefinTuna 泳ぐ");
    }
}
final class Salmon implements Fish { // 鮭
	@Override
    public void swim() {
        System.out.println("Salmon 泳ぐ");
    }
}
final class Sardine implements Fish { // 鰯
	@Override
    public void swim() {
        System.out.println("Sardine 泳ぐ");
    }
}
