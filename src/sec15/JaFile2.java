package sec15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class JaFile2 {

	public static void main(String[] args) {
		PrintWriter fout = null;
		BufferedWriter fin = null;
		String fname = "src/sec15/tst1.txt";
		try {
			fout = new PrintWriter(new BufferedWriter(new FileWriter(fname)));
			fout.println(1111);
			fout.println(2222);
			fout.close();
		} catch(IOException e) {
			System.out.println("書き込みエラー：" + e);
			System.exit(1);
		}

		BufferedReader fin = null;
		try {
			String s = null;
			fin = new BufferedReader(new FileReader(fname));
			while( (s = fin.readLine()) != null ) {
				int dt = Integer.parseInt( s );
				System.out.println("dt=" + dt);
			}
			fin.close();
		} catch(IOException e) {
			System.out.println("読み込みエラー：" + e);
			System.exit(1);
		}
	}
}
