package lesson35;

public class Box2<T> {
    private T t;
    public void set(T t) {
        this.t = t;
    }
    Box2(T t) {
        this.t     = t;
    }
    public T get() {
        return t;
    }
}
