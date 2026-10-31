package lesson28q;

class C0208Q03 {
	public static void main(String[] args) {
		Notification[] arr = { new Chat(), new Mail() };
		for (Notification n : arr) {
			disp(n);
		}
	}

	static void disp(Notification n) {
		n.sendMessage();
	}
}
