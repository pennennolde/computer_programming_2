package rpgGame;

class Wizard extends Character {

	Wizard(String name) {
		super(name);

		this.hp = 100;
		this.ap = 10;
		this.mp = 100;
	}

	void attack(Character c) {
		int damage = (int)(mp * Math.random());
		c.hp = Math.max(0, c.hp-damage);
		this.mp -= damage;
		System.out.println(this.name +  "は、" + c.name +"に" + damage + "の魔法をかけた");
		System.out.println(c.name + "のHPは、" + c.hp + "となった");
		System.out.println(this.name + "のMPは、" + this.mp + "に減った");
		System.out.println();
}

	@Override
	Character levelUp() {

		return null;
	}
}
