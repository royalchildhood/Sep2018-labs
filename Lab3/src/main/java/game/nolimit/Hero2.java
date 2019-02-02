package game.nolimit;

public class Hero2 implements HeroCharacter{
	public final String heroName;
	private int health;
	private int attack;

	public Hero2(String name, int health, int attack) {
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
		return attack;
	}

	@Override
	public void beingAttack(int hpCut) {
		health -= hpCut;
	}

	@Override
	public boolean isAlive() {
		return health > 0;
	}

	@Override
	public void ultimateAttack() {
		System.out.print("ultimateAttack");
	}
}
