package lesson35;

public class C0305Q01 {
	public static void main(String[] args) {
		TwoType<Integer, String> two = new TwoType<Integer, String>(100, "abc");
		System.out.println(two.getT());
		System.out.println(two.getS());
	}
}

//型パラメーターはT、S以外でもよい
class TwoType<T, S> {
	T t;
	S s;

	TwoType(T t, S s) {
		this.t = t;
		this.s = s;
	}

	T getT() {
		return t;
	}

	S getS() {
		return s;
	}
}
