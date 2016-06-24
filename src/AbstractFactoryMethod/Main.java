package AbstractFactoryMethod;

//补全 生产拖拉机工厂的工厂

public class Main {

	public static void main(String[] args) {
		// 创建一个生产保时捷工厂的工厂
		Provider cf = new SuperPorscheFactory();
		// 生产保时捷工厂
		CarFactory pf = cf.creatCarFactory();
		// 保时捷工厂生产保时捷汽车
		pf.productCar();
		// 按上面示例,生产拖拉机
	}

}
