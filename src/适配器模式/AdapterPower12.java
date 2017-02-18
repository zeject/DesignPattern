package 适配器模式;

public class AdapterPower12 implements IPower12 {

	private final AbsBasePower absBasePower;

	public AdapterPower12(AbsBasePower absBasePower) {
		this.absBasePower = absBasePower;
	}

	@Override
	public void output12V() {
		float powerFloat = this.absBasePower.getPower();
		if (powerFloat == 220) {
			powerFloat = powerFloat / 18.33f;
		} else {
			System.out.println("--不适配电源--");
			return;
		}
		powerFloat = (int) (powerFloat);
		System.out.println("转换为:" + powerFloat + this.absBasePower.getUnit() + "电源");
	}

}
