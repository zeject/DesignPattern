package 适配器模式;

public abstract class AbsBasePower {

	private float power;

	private String unit = "V";

	public AbsBasePower(float power) {
		this.power = power;
	}

	public float getPower() {
		return power;
	}

	public void setPower(float power) {
		this.power = power;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public void print() {
		System.out.println("AbsBasePower [power=" + power + ", unit=" + unit + "]");
	}

}
