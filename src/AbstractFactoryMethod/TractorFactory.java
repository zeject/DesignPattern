package AbstractFactoryMethod;

//拖拉机工厂
public class TractorFactory implements CarFactory {
	public void productCar() {
		System.out.println("生产拖拉机");
	}
}