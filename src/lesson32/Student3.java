package lesson32;

public record Student3(int id, String name) {
    public Student3 {
        if (id < 1) {
            throw new IllegalArgumentException("IDが不正な値です");
        }
        if (name.isBlank()) {
            throw new IllegalArgumentException("名前が未設定です");
        }
        // this.id = idとthis.name = nameは記述しない
    }
}
