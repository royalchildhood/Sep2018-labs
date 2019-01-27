package produce;

public class GLC extends BENZ{
	public GLC() {
		super("GLC");
		setEngine("V6");
	}

	@Override
	protected void setEngine(String engine) {
		this.engine = engine;
	}
}
