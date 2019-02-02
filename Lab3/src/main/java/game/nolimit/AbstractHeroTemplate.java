package game.nolimit;

abstract public class AbstractHeroTemplate {
	public final String heroName;
	private int health;

	public AbstractHeroTemplate(String name, int health) {
		this.heroName = name;
		this.health = health;
	}

	public void move() {
		System.out.print("Move up down right left");
	}

	public void normalAttack() {
		System.out.print("hero attack");
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
