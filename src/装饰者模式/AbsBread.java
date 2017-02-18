package 装饰者模式;

public abstract class AbsBread implements IBread {

	private final IBread bread;

	public AbsBread(IBread bread) {
		this.bread = bread;
	}

	@Override
	public void prepair() {
		this.bread.prepair();
	}

	@Override
	public void kneadFlour() {
		// TODO Auto-generated method stub
		this.bread.kneadFlour();
	}

	@Override
	public void steamed() {
		// TODO Auto-generated method stub
		this.bread.steamed();
	}

	@Override
	public final void process() {
		// TODO Auto-generated method stub
		prepair();
		kneadFlour();
		steamed();
	}

}
