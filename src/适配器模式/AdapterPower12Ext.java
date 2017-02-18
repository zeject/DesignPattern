package 适配器模式;

public class AdapterPower12Ext extends AbsBasePower implements IPower12 {

	public AdapterPower12Ext(AbsBasePower absBasePower) {
		super(absBasePower.getPower());
	}

	@Override
	public void output12V() {
		float powerFloat = this.getPower();
		if (powerFloat == 220) {
			powerFloat = powerFloat / 18.33f;
		} else {
			System.out.println("--不适配电源--");
			return;
		}
		powerFloat = (int) (powerFloat);
		System.out.println("转换为:" + powerFloat + this.getUnit() + "电源");
	}

}
