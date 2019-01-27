package produce;

public class Z4 extends BMW{
	public Z4() {
		super( "Z5");
		setEngine("V8");
	}

	@Override
	protected void setEngine(String engine) {
		this.engine = engine;
	}
}
