package 享元模式;

public class WhiteChessman extends AbsChessman {

	public WhiteChessman() {
		super("○");
		System.out.println("白棋");
	}

	@Override
	public void point(int x, int y) {
		this.x = x;
		this.y = y;
		this.show();
	}

}
