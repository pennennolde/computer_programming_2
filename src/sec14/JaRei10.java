package sec14;

class JaRei10 {

	public static void main(String[] args) {
		try {
			myadd( 5 );
			myadd( 0 );
		} catch( MyArgException mae) {
			System.out.println("ERR:" + mae);
		}
	}

	static void myadd(int n) throws MyArgException {
		int sum = 0;
		System.out.println("n=" + n);
		if( n<=0 ) {
			throw new MyArgException("引数が0以下は誤り");
		}
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		System.out.println("sum(1.." + n +")=" + sum);
	}
}

class MyArgException extends Exception {
	public MyArgException() {
		super();
	}

	public MyArgException(String msg) {
		super(msg);
	}
}
