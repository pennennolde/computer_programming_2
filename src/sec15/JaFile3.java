package sec15;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class JaFile3 {

	public static void main(String[] args) {
		Scanner sc = null;

		try {
			sc = new Scanner(new File("src/sec15/tstfile1.txt"));
			sc.useDelimiter("\\s*,\\s*|\r\n");
			while( sc.hasNext() ) {
				String s = sc.next();
				System.out.println("s=[" + s + "]");
			}
			sc.close();
		} catch (IOException e) {
			System.out.println("読み込みエラー：" + e);
			System.exit(1);
		}
	}
}
