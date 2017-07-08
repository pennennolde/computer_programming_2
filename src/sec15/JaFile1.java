package sec15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class JaFile1 {

	public static void main(String[] args) {
		String s;
		String fname ="src/sec15/tst1";
		try {
			PrintWriter fout = new PrintWriter( new BufferedWriter( new FileWriter("tst1.txt")));
			fout.println("aaaa");
			fout.println("bbbb");
			fout.close();
		} catch(Exception e) {
			System.out.println("書き込みエラー：" + e);
			System.exit(1);
		}

		try {
			BufferedReader fin = new BufferedReader( new FileReader("tst1.txt"));
			s = fin.readLine();
			System.out.println( s );
			s = fin.readLine();
			System.out.println( s );
			fin.close();
		} catch(Exception e) {
			System.out.println("読み込みエラー：" + e);
			System.exit(1);
		}
	}
}
