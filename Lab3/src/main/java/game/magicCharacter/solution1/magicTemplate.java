package game.magicCharacter.solution1;

import game.OffenseFocusHero;
import game.magicCharacter.MagicFocusHero;
import game.nolimit.HeroCharacter;

abstract public class magicTemplate implements HeroCharacter, MagicFocusHero, OffenseFocusHero{
	public final String heroName;
	private int health;
	private int attack;

	public magicTemplate(String name, int health, int attack) {
		this.heroName = name;
		this.health = health;
		this.attack = attack;
	}

	@Override
	public void move() {
		System.out.print("Move up down right left");
	}

	@Override
	public int normalAttack() {
		return attack*getCriticalHitRatio() + attack*getMagicDamageRatio()/10;
	}

	@Override
	public void beingAttack(int hpCut) {
		health -= hpCut;
	}

	@Override
	public boolean isAlive() {
		return health > 0;
	}

	abstract public void ultimateAttack();

	abstract public int getCriticalHitRatio();

	abstract public int getMagicDamageRatio();
}
