package game;

public class StoneMan extends DefenseHeroTemplate{
	public StoneMan() {
		super("Stone man", 80, 5);
	}

	@Override
	public void ultimateAttack() {
		System.out.print("Alice the kill ultimate-kill");
	}

	@Override
	public int getExtraArmarRatio() {
		return 2;
	}
}
