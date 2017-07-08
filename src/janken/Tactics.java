package janken;

/**
 * 戦略インタフェース
 */
public interface Tactics {

   /**
    * 戦略に従って、以下のジャンケンの手のいずれかを作成し、返す
    * Choice.STONE : ぐー
    * Choice.SCISSORS : ちょき
    * Choice.PAPER : ぱー
    *
    * @return ジャンケンの手
    */
   public Choice readTactics();
}