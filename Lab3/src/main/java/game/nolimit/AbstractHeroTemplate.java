package game.nolimit;

abstract public class AbstractHeroTemplate {
	public final String heroName;
	private int health;
	private int attack;

	public AbstractHeroTemplate(String name, int health, int attack) {
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

	public void ultimateAttack() {

	}

	abstract public int getCriticalHitRatio();

	abstract public int getExtraArmarRatio();
}
