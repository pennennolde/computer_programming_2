package sec10;

public class JaCls07 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		System.out.println("-----インスタンス生成前の操作");
		MyCls.clsVar = 33;
		MyCls.clsMeth();

		System.out.println("-----インスタンスメンバの操作");
		MyCls a = new MyCls();
		MyCls b = new MyCls();
		a.insVar = 10;
		b.insVar = 20;
		a.insMeth();
		b.insMeth();
		System.out.println("-----クラスメンバの操作");
		a.clsVar = 99;  // MyCls.clsVar = 99;
		System.out.println(a.clsVar);
		System.out.println(b.clsVar);
		System.out.println(MyCls.clsVar);
	}

}

class MyCls {
	int insVar = 0;
	static int clsVar = 0;

	public void insMeth() {
		System.out.println("insMeth: insVar=" + insVar + " clsVar=" + clsVar);
	}

	public static void clsMeth() {
		System.out.println("clsMeth: clsVar=" + clsVar);
	}
}
