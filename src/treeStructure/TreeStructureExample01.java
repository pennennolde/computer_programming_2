package treeStructure;

import java.util.Scanner;

public class TreeStructureExample01 {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();

		bst.insert("Snoopy");
		bst.insert("Linus");
		bst.insert("Marcie");
		bst.insert("WoodStock");
		bst.insert("Lucy");
		bst.insert("Sally");

		System.out.println("何がしたいのかな?");
		System.out.println("数字を入力してね!");
		System.out.println("1.追加");
		System.out.println("2.削除");
		System.out.println("3.検索");
		System.out.println("4.木を見る");

		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();

		if( x == 1 ) {
			System.out.println("追加したい名前を入力してね!");
			Scanner scan1 = new Scanner(System.in);
			String x1 = scan1.nextLine();
			bst.insert( x1 );
			System.out.println("\"" + x1 + "\"を追加したよ!");
			System.out.println();
			bst.show();

		} else if( x == 2 ) {
			System.out.println("削除したい名前を入力してね!");
			Scanner scan2 = new Scanner(System.in);
			String x2 = scan2.nextLine();
			bst.delete( x2 );
			System.out.println();
			bst.show();

		} else if( x == 3 ) {
			System.out.println("検索したい名前を入力してね!");
			Scanner scan3 = new Scanner(System.in);
			String x3 = scan3.nextLine();
			System.out.println("\"" + x3 + "\"を検索したよ!");
			System.out.println();
			bst.searchOut( x3);

		} else if( x == 4 ) {
			System.out.println();
			bst.show();

		} else {
			System.out.println();
			System.out.println("(フリーズ)");
		}
	}
}