package janken;

/**
 * オブジェクト指向版ジャンケンプログラム
 */
public class ObjectJanken {
    public static void main(String[] args) {

        Judge judge = new Judge();
        Player player1 = new Player("太郎くん");
        Player player2 = new Player("花子さん");

        judge.startJanken(player1, player2);
    }
}