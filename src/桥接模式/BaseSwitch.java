package 桥接模式;

public class BaseSwitch {

	protected ILight light;

	public BaseSwitch(ILight light) {
		this.light = light;
	}

	public final void makeLight() {
		this.light.electricConnected();
		this.light.light();
		this.light.electricClosed();
	}

}
