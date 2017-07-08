package janken;

/**
 * 戦略インタフェース版ジャンケン・プログラム
 */
public class ObjectJanken3 {

   public static void main(String[] args) {
      Judge judge = new Judge();

      Player player1 = new Player("次郎くん");
      player1.setTactics(new StoneTactics());

      Player player2 = new Player("花子さん");
      player2.setTactics(new RandomTactics());

      judge.startJanken(player1, player2);
   }
}