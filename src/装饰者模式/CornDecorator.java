package 装饰者模式;

public class CornDecorator extends AbsBread {

	public CornDecorator(IBread bread) {
		// TODO Auto-generated constructor stub
		super(bread);
	}

	public void paint() {
		System.out.println("添加染色剂");
	}

	@Override
	public void kneadFlour() {
		this.paint();
		super.kneadFlour();
	}
}
