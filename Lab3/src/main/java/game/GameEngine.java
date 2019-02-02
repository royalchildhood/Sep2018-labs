package game;

import game.nolimit.AbstractHeroTemplate;

public class GameEngine {

	public static void main(String[] args) {

		HeroCharacter hero1 = chooseHero("Alice");

		hero1.move();
		hero1.normalAttack();
		hero1.ultimateAttack();
		hero1.beingAttack(3);

		HeroCharacter hero2 = chooseHero("Stone");

		hero2.move();
		hero2.normalAttack();
		hero2.ultimateAttack();
		hero2.beingAttack(6);
	}

	public static HeroCharacter chooseHero(String name) {
		if (name.equals("Alice")) {
			return new AliceTheKiller();
		} else if (name.equals("Stone")) {
			return new StoneMan();
		} else {
			return null;
		}
	}
}
