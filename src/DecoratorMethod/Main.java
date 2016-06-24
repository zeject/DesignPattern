package DecoratorMethod;

// 装饰器模
public class Main {

	public static void main(String[] args) {
		Coffee coffee = new Coffee("拿铁", 20);
		// 加糖
		Decorator sugar = new Sugar();
		sugar.setCoffee(coffee);
		sugar.showCoffee();
		System.out.println(sugar.showPrice());
		// 补全,加糖,加牛奶的咖啡
		Decorator sugarMilk = new SugarMilk();
		sugarMilk.setCoffee(coffee);
		sugarMilk.showCoffee();
		System.out.println(sugarMilk.showPrice());

	}

}
