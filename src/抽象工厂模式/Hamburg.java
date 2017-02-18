package 抽象工厂模式;

public abstract class Hamburg extends AbstractBaseFood implements IFood {

	public Hamburg() {
		this.name = "汉堡";
	}

	@Override
	public void printMessage() {
		System.out.println(this.kind + this.name + this.price + "*" + this.num + "共:" + this.totalPrice());
	}
}
