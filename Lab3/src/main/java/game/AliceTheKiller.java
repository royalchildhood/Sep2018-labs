package game;

public class AliceTheKiller extends OffenseHeroTemplate{

	public AliceTheKiller() {
		super("Alice", 50, 10);
	}

	@Override
	public void ultimateAttack() {
		System.out.print("Alice the kill ultimate-kill");
	}

	@Override
	public int getCriticalHitRatio() {
		return 2;
	}
}
