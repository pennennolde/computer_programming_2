package rpgGame;

class Monster extends Character {

	Monster(String name) {
		super(name);

		this.hp = 200;
		this.ap = 10;
		this.mp = 20;
	}

	void attack(Character c) {
		System.out.println("モンスターの攻撃は未定義");
	}

	@Override
	Character levelUp() {
		System.out.println("モンスターのレベルアップは未定義");
		return null;
	}


}

