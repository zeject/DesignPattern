package DecoratorMethod;

// 加糖咖啡
class Sugar extends Decorator {
	@Override
	public void showCoffee() {
		System.out.println("加糖");
		super.showCoffee();
	}

	@Override
	public float showPrice() {
		return super.showPrice() + 5;
	}
}