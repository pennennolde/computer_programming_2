package janken;

/**
 * ジャッジを表すクラス
 */
public class Judge {

    /** ゲームの回数 */
    static final int GAME_COUNT = 3;

    /**
    * ジャンケンを開始させる
    */
    public void startJanken(Player player1, Player player2) {
        System.out.println("【"+player1.getName()+"と"+
            player2.getName()+"によるジャンケンを開始します】");
        for(int count=0; count<GAME_COUNT; count++) {
            System.out.println("《"+(count+1)+"回戦》");
            Player winner = judgeJanken(player1, player2);
            if( winner != null ) {
                System.out.println(winner.getName() + "が勝ちました。");
                winner.notifyResult( WinLose.WIN );
            } else {
                System.out.println("引き分けです。");
            }
        }
        Player finalWinner = judgeFinalWinner(player1, player2);
        System.out.print( player1.getWinCount() + " 対 " +
            player2.getWinCount() + " で、");
        if( finalWinner != null ) {
            System.out.println(finalWinner.getName() + "の勝ちです。");
        } else {
            System.out.println("引き分けです。");
        }
    }

    /**
    * プレイヤに手を出させ、どちらが勝ちかを判定する
    * @param player1 プレイヤ１
    * @param player2 プレイヤ２
    * @return 勝者。引き分けの場合 null を返す
    */
    private Player judgeJanken(Player player1, Player player2) {

        Choice player1Hand = player1.showHand();
        Choice player2Hand = player2.showHand();

        printHand(player1Hand);
        System.out.print(" vs. ");
        printHand(player2Hand);
        System.out.println();

        Player winner = null;
        if( (player1Hand == Choice.STONE && player2Hand == Choice.SCISSORS)
            || (player1Hand == Choice.SCISSORS && player2Hand == Choice.PAPER)
            || (player1Hand == Choice.PAPER && player2Hand == Choice.STONE) ) {
            winner = player1;
        } else if( (player2Hand == Choice.STONE && player1Hand == Choice.SCISSORS)
            || (player2Hand == Choice.SCISSORS && player1Hand == Choice.PAPER)
            || (player2Hand == Choice.PAPER && player1Hand == Choice.STONE) ) {
            winner = player2;
        }
        return winner;
    }

    /**
    * 最終的な勝者を判定する
    * @param player1 プレイヤ１
    * @param player2 プレイヤ２
    * @return 勝者。引き分けの場合 null を返す
    */
    private Player judgeFinalWinner(Player player1, Player player2) {

        int player1WinCount = player1.getWinCount();
        int player2WinCount = player2.getWinCount();

        Player winner = null;
        if( player1WinCount > player2WinCount ) {
            winner = player1;
        } else if( player1WinCount < player2WinCount ) {
            winner = player2;
        }
        return winner;
    }

    /**
    * ジャンケンの手を表示する
    * @param hand ジャンケンの手
    */
    private void printHand(Choice hand) {
        switch( hand ) {
        case STONE:
            System.out.print("ぐー");
            break;
        case SCISSORS:
            System.out.print("ちょき");
            break;
        case PAPER:
            System.out.print("ぱー");
            break;
        }
    }
}