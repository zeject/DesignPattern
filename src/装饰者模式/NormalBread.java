package 装饰者模式;

public class NormalBread implements IBread {

	@Override
	public void prepair() {
		// TODO Auto-generated method stub
		System.out.println("准备材料");
	}

	@Override
	public void kneadFlour() {
		// TODO Auto-generated method stub
		System.out.println("和面");
	}

	@Override
	public void steamed() {
		// TODO Auto-generated method stub
		System.out.println("蒸馒头");
	}

	@Override
	public void process() {
		// TODO Auto-generated method stub
		prepair();
		kneadFlour();
		steamed();
	}

}
