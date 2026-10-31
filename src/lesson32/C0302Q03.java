package lesson32;

public class C0302Q03 {
    public static void main(String[] args) {
        // 適宜クラスは変更して実施する
//        Fish fish = new Tuna();
//        Fish fish = new BluefinTuna();
//        Fish fish = new Salmon();
        Fish fish = new Sardine();
        switch (fish) {
        case BluefinTuna b -> b.swim();
        case Tuna t -> t.swim();
        // case BluefinTuna b -> b.swim();		// Tunaを先に書くとコンパイルエラー
        case Salmon sl -> sl.swim();
        case Sardine sr -> sr.swim();
        }
        
        // ↑この場合はすべてswimメソッドを使っているので、場合分けの意味があまりない
        // 単に、fish.swim();でよい（ポリモーフィズム）
        fish.swim();
        
        
        System.out.println();
        
        
        Fish[] fs = {new Tuna(), new BluefinTuna(), new Salmon(), new Sardine()};
        for (Fish f : fs) {
        	switch (f) {
        	case BluefinTuna b -> b.swim();
            case Tuna t -> t.swim();
            case Salmon sl -> sl.swim();
            case Sardine sr -> sr.swim();
            }
        }
    }
}
