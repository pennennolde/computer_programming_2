package janken;

/**
 * オブジェクト指向版ジャンケンプログラム
 */
public class ObjectJanken2 {
   public static void main(String[] args) {

      Judge judge = new Judge();
      Player player1 = new StonePlayer("次郎くん");
      Player player2 = new Player("花子さん");

      // ジャッジは２人を Player クラスのインスタンスとして見てる
      judge.startJanken(player1, player2);
   }
}