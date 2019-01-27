package produce;

public class X5 extends BMW{
	public X5() {
		super( "X5");
		setEngine("V6");
	}

	@Override
	protected void setEngine(String engine) {
		this.engine = engine;
	}
}
