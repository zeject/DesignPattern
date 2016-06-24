package DecoratorMethod;

// 抽象装饰器
public abstract class Decorator implements ICoffee {
	private ICoffee coffee;

	public void setCoffee(ICoffee coffee) {
		this.coffee = coffee;
	}

	public void showCoffee() {
		coffee.showCoffee();
	}

	public float showPrice() {
		return coffee.showPrice();
	}
}