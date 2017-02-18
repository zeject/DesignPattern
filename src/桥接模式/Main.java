package 桥接模式;

public class Main {
	public static void main(String[] args) {
		ILight incandescentLight = new IncandescentLight();

		ILight crystalLight = new CrystalLight();

		System.out.println("--普通开关--");
		BaseSwitch switch1 = new BaseSwitch(incandescentLight);
		switch1.makeLight();

		System.out.println("--遥控开关--");
		RemoteControlSwitch remoteControlSwitch = new RemoteControlSwitch(crystalLight);
		remoteControlSwitch.makeRemoteLight(1);

		remoteControlSwitch = new RemoteControlSwitch(incandescentLight);
		remoteControlSwitch.makeRemoteLight(1);
	}
}
