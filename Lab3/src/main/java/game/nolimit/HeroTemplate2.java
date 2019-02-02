package game.nolimit;

public class HeroTemplate2 {
	public final String heroName;
	private int health;
	private int attack;

	public HeroTemplate2(String name, int health, int attack) {
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

	public void ultimateAttack() {

	}

	public int getExtraArmarRatio() {
		return 1;
	}
}
