package janken;

/**
 * プレイヤを継承した「グーだけプレイヤ」のクラス
 */
public class StonePlayer extends Player {

   /**
    * コンストラクタ
    * スーパークラスのコンストラクタを呼び出す
    */
   public StonePlayer(String name) {
      super(name);
   }

   /**
    * 常に「ぐー」で、ジャッジに答える
    * スーパークラスの同名メソッドをオーバーライド
    * @return ジャンケンの手「ぐー」
    */
   public Choice showHand() {
      return Choice.STONE;
   }
}