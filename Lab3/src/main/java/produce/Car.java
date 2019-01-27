package produce;

public class Car {
	public String brandName;
	public final int numberWheel = 4;
	public final boolean hasBreak = true;
	public String engine = "";
	public String branchName = "";

	public Car(String brandName, String branchName) {
		this.brandName = brandName;
		this.branchName = branchName;
	}

	@Override
	public String toString() {
		return brandName + " " + branchName + " with " + engine + " engine";
	}

	public final String getBrandName() {
		return brandName;
	}

	public final String getBranchName() {
		return branchName;
	}

	protected void setEngine(String engine) {
		this.engine = engine;
	}
}
