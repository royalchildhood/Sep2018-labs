package game;

abstract public class DefenseHeroTemplate implements HeroCharacter, DefenseFocusHero {
	public final String heroName;
	private int health;
	private int attack;

	public DefenseHeroTemplate(String name, int health, int attack) {
		this.heroName = name;
		this.health = health;
		this.attack = attack;
	}

	public void move() {
		System.out.print("Move up down right left");
	}

	public int normalAttack() {
		return attack;
	}

	public void beingAttack(int hpCut) {
		health -= hpCut/getExtraArmarRatio();
	}

	public boolean isAlive() {
		return health > 0;
	}

	abstract public void ultimateAttack();

	abstract public int getExtraArmarRatio();

}
