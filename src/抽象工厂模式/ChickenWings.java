package 抽象工厂模式;

public abstract class ChickenWings extends AbstractBaseFood implements IFood {

	public ChickenWings() {
		// TODO Auto-generated constructor stub
		this.name = "鸡翅";
	}

	@Override
	public void printMessage() {
		System.out.println(this.kind + this.name + this.price + "*" + this.num + "共:" + this.totalPrice());
	}

}
