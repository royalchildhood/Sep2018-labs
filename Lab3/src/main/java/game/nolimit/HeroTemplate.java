package game.nolimit;

public class HeroTemplate {
	public final String heroName;
	private int health;
	private int attack;

	public HeroTemplate(String name, int health, int attack) {
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
		health -= hpCut/getExtraArmarRatio();
	}

	public boolean isAlive() {
		return health > 0;
	}

	public void ultimateAttack() {

	}

	public int getCriticalHitRatio() {
		return 1;
	}

	public int getExtraArmarRatio() {
		return 1;
	}
}
