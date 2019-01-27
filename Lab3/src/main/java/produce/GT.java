package produce;

public class GT extends BENZ{
	public GT() {
		super("GT AMG");
		setEngine("V8");
	}

	@Override
	protected void setEngine(String engine) {
		this.engine = engine;
	}
}