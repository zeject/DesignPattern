package AbstractFactoryMethod;

//保时捷工厂
public class PorscheFactory implements CarFactory {
	public void productCar() {
		System.out.println("生产保时捷汽车");
	}
}