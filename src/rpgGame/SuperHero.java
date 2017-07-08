package rpgGame;

class SuperHero extends Hero {
	
	SuperHero(String name) {
		super( name );
		hp = 100;
		ap = 60;
	}
	
	void attack(Character c) {
		System.out.println(this.name + "は、ダブルアタックした");
		super.attack
	}
}
