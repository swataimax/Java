package lesson35;

public class Box {
    private Object object;
    public void set(Object object) {
        this.object = object;
    }
    Box(Object object) {
        this.object = object;
    }
    public Object get() {
        return object;
    }
}
