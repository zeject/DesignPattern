package 享元模式;

public class BlackChessman extends AbsChessman {

	public BlackChessman() {
		super("●");
		System.out.println("黑棋");
	}

	@Override
	public void point(int x, int y) {
		this.x = x;
		this.y = y;
		this.show();
	}

}
