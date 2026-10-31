package lesson28q;

class C0208Q01 implements Stove {
	public static void main(String[] args) {
		Stove stove = new C0208Q01();
		stove.ignition(temp);
	}

	public void ignition(int temp) {
		System.out.println("点火します");
		System.out.println("設定温度:" + temp);
	}
}
