package game;

abstract public class OffenseHeroTemplate implements HeroCharacter, OffenseFocusHero {
	public final String heroName;
	private int health;
	private int attack;

	public OffenseHeroTemplate(String name, int health, int attack) {
		this.heroName = name;
		this.health = health;
		this.attack = attack;
	}

	public void move() {
		System.out.print("Move up down right left");
	}

	public int normalAttack() {
		return attack * getCriticalHitRatio();
	}

	public void beingAttack(int hpCut) {
		health -= hpCut;
	}

	public boolean isAlive() {
		return health > 0;
	}

	abstract public void ultimateAttack();

	abstract public int getCriticalHitRatio();
}
