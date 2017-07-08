package janken;

/**
 * プレイヤを表すクラス
 */
public class Player {

   /** プレイヤの名前 */
   private String name;
   /** 勝ち数 */
   private int winCount = 0;

   /** 戦略 */
   private Tactics tactics;

   /**
    * プレイヤのコンストラクタ
    * @param name プレイヤの名前
    */
   public Player(String name) {
      this.name = name;
   }

   /**
    * 名前を返す
    * @return プレイヤの名前
    */
   public String getName() {
      return this.name;
   }

   /**
    * 勝ち数を答える
    * @return 勝った回数
    */
   public int getWinCount() {
      return this.winCount;
   }

   /**
    * 戦略をセットする
    * @param tactics ジャンケンの戦略
    */
   public void setTactics(Tactics tactics) {
       this.tactics = tactics;
   }

   /**
    * ジャンケンの手を決め、ジャッジに答える
    * @return ジャンケンの手
    */
   public Choice showHand() {
      Choice hand = tactics.readTactics();
      return hand;
   }

   /**
    * 勝敗を聞いて、勝ち数を修正する
    * @param result WIN:勝ち, LOSE:負け
    */
   public void notifyResult(WinLose result) {
      if( result == WinLose.WIN ) {
         winCount++;
      }
   }
}
