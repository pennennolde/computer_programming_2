package rpgGame;

abstract class Character {

	String name; //名前
	int hp; //体力
	int ap; //攻撃力
	int mp; //魔力
	Material[] mat; //道具
	int countMat; //道具の個数

	Character(String name) {
		this.name = name;
		hp = 0;
		ap = 0;
		mp = 0;
		mat = new Material[10];
		countMat = 0;
	}

	// 持ち物による攻撃力アップ分の計算
	int plusAp() {
		int sum = 0;
		for(int i=0; i<countMat; i++) {
			sum += mat[i].plusAp;
		}
		return sum;
	}

	// cを攻撃する
	abstract void attack(Character c);

	// レベルアップする
	abstract Character levelUp();

}
