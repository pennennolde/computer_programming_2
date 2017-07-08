package rpgGame;

class RPGGame {

	public static void main(String[] args) {
		Character hero = new Hero("内藤健士郎");
		Character heroine = new Wizard("有馬");
		Character monster = new Monster("TOEIC");

		hero.attack( monster );
		heroine.attack( monster );
		hero = hero.levelUp();
		hero.attack( monster );
	}
}
