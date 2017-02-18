package 桥接模式;

public class CrystalLight implements ILight {

	@Override
	public void light() {
		// TODO Auto-generated method stub
		System.out.println("水晶灯照明");
	}

	@Override
	public void electricConnected() {
		// TODO Auto-generated method stub
		System.out.println("打开水晶灯");
	}

	@Override
	public void electricClosed() {
		// TODO Auto-generated method stub
		System.out.println("关闭水晶灯");
	}

}
