package 抽象工厂模式;

public abstract class AbstractBaseFood {

	protected String kind;

	protected String name;

	protected int num;

	protected float price;

	public float totalPrice() {
		return this.price * this.num;
	}

}
