package 享元模式;

public abstract class AbsChessman {

	// 棋子坐标
	protected int x;
	protected int y;

	// 棋子类别 (黑|白)
	protected String chess;

	public AbsChessman(String chess) {
		this.chess = chess;
	}

	public abstract void point(int x, int y);

	public void show() {
		System.out.println(this.chess + "(" + this.x + "," + this.y + ")");
	}

}
