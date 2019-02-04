package game.magicCharacter.solution2;

import game.OffenseHeroTemplate;
import game.magicCharacter.MagicFocusHero;

abstract public class magicTemplate extends OffenseHeroTemplate implements MagicFocusHero{

	public magicTemplate(String name, int health, int attack) {
		super(name, health, attack);
	}

	@Override
	public int normalAttack() {
		return super.normalAttack() + super.normalAttack()*getMagicDamageRatio()/10;
	}

	abstract public void ultimateAttack();

	abstract public int getCriticalHitRatio();

	abstract public int getMagicDamageRatio();
}
