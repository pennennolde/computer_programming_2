package janken;

/**
 * ランダムに手を決める戦略クラス
 */
public class RandomTactics implements Tactics {

   /**
    * ジャンケンの手をランダムに返す
    *
    * @return ジャンケンの手
    */
   public Choice readTactics() {
      Choice hand;
      int randomNum = (int)(Math.random() * 3);
      switch( randomNum ) {
      case 0:
         hand = Choice.STONE;
         break;
      case 1:
         hand = Choice.SCISSORS;
         break;
      case 2:
      default:
         hand = Choice.PAPER;
         break;
      }
      return hand;
   }
}
