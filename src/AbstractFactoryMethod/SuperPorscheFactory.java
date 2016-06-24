package AbstractFactoryMethod;

//生产保时捷工厂的工厂
public class SuperPorscheFactory implements Provider {
	public CarFactory creatCarFactory() {
		return new PorscheFactory();
	}
}