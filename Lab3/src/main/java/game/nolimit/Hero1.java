package game.nolimit;

public class Hero1 extends AbstractHeroTemplate{
	public Hero1(String name, int health) {
		super("Hero1", 100);
	}

	@Override
	public int getCriticalHitRatio() {
		return 2;
	}

	@Override
	public int getExtraArmarRatio() {
		return 2;
	}
}
