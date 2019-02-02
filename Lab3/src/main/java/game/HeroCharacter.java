package game;

public interface HeroCharacter {
	public void move();
	public int normalAttack();
	public void beingAttack(int hpCut);
	public boolean isAlive();
	public void ultimateAttack();
}
