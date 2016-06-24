package DecoratorMethod;

// 原始咖啡
public class Coffee implements ICoffee {
	private String name;
	private float price;

	public Coffee(String name, float price) {
		this.name = name;
		this.price = price;
	}

	public void showCoffee() {
		System.out.println(name + " coffee");
	}

	public float showPrice() {
		return price;
	}
}