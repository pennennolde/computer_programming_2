package sec14;

import java.io.FileNotFoundException;
import java.io.FileReader;

class JaRei05 {

	public static void main(String[] args) {
		JaRei05.extst( 1 );
		extst( 2 );
		extst( 3 );
	}

	static void extst(int n) {
		FileReader fr;
		int dt;
		try {
			if( n==1 ) fr = new FileReader("zzz.txt");
			if( n==2 ) dt = Integer.parseInt("abcde");
			if( n==3 ) dt = Integer.parseInt("12345");
		} catch ( FileNotFoundException fnfe) {
			System.out.println("ERR1" + fnfe);
			return;
		} catch( NumberFormatException nfe) {
			System.out.println("ERR2" + nfe);
			return;
		} catch( Exception e) {
			System.out.println("例外が起こりました。");
			return;
		}
		System.out.println("正しく処理しました。");
	}
}
