package sec14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		Scanner fopen = new Scanner(System.in);
		Scanner scan = null;
		String str = null;
		while(true) {
			System.out.print("ファイル名:");
			String fname = fopen.nextLine();
			try {
				scan = new Scanner(new File("src/sec14/" + fname));
				break;
			} catch (FileNotFoundException e) {
				System.out.println("ファイルが見つかりません。");
			} catch (NoSuchElementException e) {
				System.out.println("ファイルの中身が空です。");
			}
		}
		System.out.println( str );
		fopen.close();
		scan.close();
	}
}
