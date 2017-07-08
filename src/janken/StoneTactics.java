package janken;

/**
 * 「ぐー」しか出さない戦略クラス
 */
public class StoneTactics implements Tactics {

   /**
    * ジャンケンの手を「ぐー」に固定して返す
    *
    * @return 「ぐー」
    */
   public Choice readTactics() {
      return Choice.STONE;
   }
}