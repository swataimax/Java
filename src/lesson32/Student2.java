package lesson32;

public record Student2(int id, String name) {
    public Student2(int id, String name) {
        if (id < 1) {
            throw new IllegalArgumentException("IDが不正な値です");
        }
        if (name.isBlank()) { // 変数が空か判定
            throw new IllegalArgumentException("名前が未設定です");
        }
        this.id = id; // 初期化
        this.name = name; // 初期化
    }
}
