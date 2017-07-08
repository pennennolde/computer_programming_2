package sec14;

import java.io.FileNotFoundException;
import java.io.FileReader;

class JaRei06 {

	public static void main(String[] args) {
		extst( 1 );
		extst( 2 );
		extst( 3);
	}

	static void extst(int n) {
		FileReader fr;
		int ii;
		try {
			if( n == 1 ) fr = new FileReader("zzz.txt");
			if( n == 2 ) ii = Integer.parseInt("abcde");
			if( n == 3 ) ii = Integer.parseInt("12345");
		} catch( FileNotFoundException fnfe) {
			System.out.println("EER1:" + fnfe);
			return;
		} catch( NumberFormatException nfe) {
			System.out.println("ERR2:" + nfe);
		} finally {
			System.out.println("finallyを実行しました。");
		}
		System.out.println("終了しました。");
	}
}
