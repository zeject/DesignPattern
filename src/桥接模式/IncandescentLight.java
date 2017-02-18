package 桥接模式;

public class IncandescentLight implements ILight {

	@Override
	public void light() {
		// TODO Auto-generated method stub
		System.out.println("白炽灯照明");
	}

	@Override
	public void electricConnected() {
		// TODO Auto-generated method stub
		System.out.println("打开白炽灯");
	}

	@Override
	public void electricClosed() {
		// TODO Auto-generated method stub
		System.out.println("关灯白炽灯");
	}

}
