package sec14;

import java.io.FileNotFoundException;
import java.io.FileReader;

class JaRei01 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("zzz.txt");
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("-例外が発生しました。: " + e);
		}
		System.out.println("とりあえず、プログラムは続く。");
	}
}
