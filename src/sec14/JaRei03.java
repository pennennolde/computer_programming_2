package sec14;

class JaRei03 {

	public static void main(String[] args) {
		int a;
		int b = 0;
		try {
		a = 100 / b;
		}
		catch(ArithmeticException ae) {
			System.out.println("0割りが起こりました。1で割っておきます。");
			b = 1;
			a = 100 / b;
		}
		System.out.println("a=" + a);

		int n = -1;
		int[] d = new int[5];
		try {
		d[n] = 123;
		} catch( ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("配列添え字のオーバーです。0番にしておきます。");
			n = 0;
			d[n] = 123;
		}
	}
}
