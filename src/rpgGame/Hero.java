package rpgGame;

class Hero extends Character {

	Hero(String name) {
		super(name);

		this.hp = 50;
		this.ap = 30;
		this.mp = 0;
		mat[countMat++] = new Bat("こん棒");
	}

	void attack(Character c) {
		int damage = (int)((ap+plusAp()) * (1+ Math.random()) / 2);
		c.hp = Math.max(0, c.hp-damage);
		System.out.println(this.name +  "は、" + c.name +"に" + damage + "のダメージを与えた");
		System.out.println(c.name + "のHPは、" + c.hp + "となった");
		System.out.println();
	}

	Character levelUp() {
		System.out.println(this.name + "は、スーパーヒーローになった");
		return new SuperHero( this.name );
	}
}
