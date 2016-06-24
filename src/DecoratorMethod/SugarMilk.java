package DecoratorMethod;

// 补全,加牛奶的咖啡
class SugarMilk extends Decorator {
	@Override
	public void showCoffee() {
		System.out.println("加牛奶");
		super.showCoffee();
	}

	@Override
	public float showPrice() {
		return super.showPrice() + 10;
	}
}