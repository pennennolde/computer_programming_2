package janken;

/**
 * オブジェクト指向を使わないジャンケン・プログラム
 */
public class SimpleJanken {

		// 定数宣言：enum はまだ教えていない！
		enum Choice { STONE, SCISSORS, PAPER }

		public static void main(String[] args) {

	    	// 変数宣言
	        int player1WinCount = 0; // プレイヤ１の勝ち数
	        int player2WinCount = 0; // プレイヤ２の勝ち数
	        int gameCount = 3; // ゲームの回数

	        // ジャンケンの開始を表示
	        System.out.println("【ジャンケンを開始します】");
	        // ジャンケンを繰り返し実施する
	        for (int count = 0; count < gameCount; count++) {
	            System.out.println("《" + (count + 1) + "回戦》"); // 何回戦目かの表示

	            // プレイヤ１の手を決める
	            Choice player1Hand = Choice.STONE; // プレイヤ１の出す手
	            switch ( (int)(Math.random() * 3) ) {   // ジャンケンの手を決めるための乱数
	            case 0:
	                player1Hand = Choice.STONE;
	                //System.out.print("ぐー");
	                break;
	            case 1:
	                player1Hand = Choice.SCISSORS;
	                //System.out.print("ちょき");
	                break;
	            case 2:
	                player1Hand = Choice.PAPER;
	                //System.out.print("ぱー");
	                break;
	            }

	            System.out.print(" vs. ");

	            // プレイヤ２の手を決める
	            Choice player2Hand = Choice.STONE; // プレイヤ２の出す手
	            switch ( (int)(Math.random() * 3) ) {
	            case 0:
	                player2Hand = Choice.STONE;
	                System.out.print("ぐー");
	                break;
	            case 1:
	                player2Hand = Choice.SCISSORS;
	                System.out.print("ちょき");
	                break;
	            case 2:
	                player2Hand = Choice.PAPER;
	                System.out.print("ぱー");
	                break;
	            }

	            System.out.println();

	            // どちらが勝ちかを判定、結果を表示する
	            if ((player1Hand == Choice.STONE && player2Hand == Choice.SCISSORS)
	                    || (player1Hand == Choice.SCISSORS && player2Hand == Choice.PAPER)
	                    || (player1Hand == Choice.PAPER && player2Hand == Choice.STONE)) { // プレイヤ１が勝つ場合
	                System.out.println("プレイヤ１が勝ちました。");
	                // プレイヤ１の勝ち数に１加算する
	                player1WinCount++;
	            } else if ((player2Hand == Choice.STONE && player1Hand == Choice.SCISSORS)
	                    || (player2Hand == Choice.SCISSORS && player1Hand == Choice.PAPER)
	                    || (player2Hand == Choice.PAPER && player1Hand == Choice.STONE)) { // プレイヤ２が勝つ場合
	                System.out.println("プレイヤ２が勝ちました。");
	                // プレイヤ２の勝ち数に１加算する
	                player2WinCount++;
	            } else {
	                System.out.println("引き分けです。");
	            }
	        } // じゃんけんを３回行って、以下に抜ける

	        // ３回戦が終了後、最終的な勝者を判定・表示する
	        System.out.print(player1WinCount + " 対 " + player2WinCount + " で、");
	        if (player1WinCount > player2WinCount) {
	            System.out.println("プレイヤ１の勝ちです。");
	        } else if (player1WinCount < player2WinCount) {
	            System.out.println("プレイヤ２の勝ちです。");
	        } else {
	            System.out.println("引き分けです。");
	        }

	        // ジャンケンの終了を表示
	        System.out.println("【ジャンケンを終了します】");
	    }
	}

