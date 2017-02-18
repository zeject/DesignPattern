package 装饰者模式;

public class SweetDecorator extends AbsBread {

	public SweetDecorator(IBread bread) {
		// TODO Auto-generated constructor stub
		super(bread);
	}

	public void paint() {
		System.out.println("添加糖精");
	}

	@Override
	public void kneadFlour() {
		this.paint();
		super.kneadFlour();
	}
	
}
