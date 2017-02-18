package 桥接模式;

public class RemoteControlSwitch extends BaseSwitch {

	public RemoteControlSwitch(ILight light) {
		super(light);
	}

	public final void makeRemoteLight(int operColor) {
		this.light.electricConnected();
		this.light.light();
		String color = "";
		switch (operColor) {
		case 1:
			color = "红色";
			break;
		case 2:
			color = "蓝色";
			break;
		default:
			color = "白色";
			break;
		}
		System.out.println("现在是" + color);
		this.light.electricClosed();
	}

}
