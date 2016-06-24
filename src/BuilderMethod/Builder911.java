package BuilderMethod;

// 911制造者
public class Builder911 implements Builder {
	Car car = new Car();

	public void buildFrame() {
		System.out.println("制造911骨架");
	}

	public void buildEngine() {
		System.out.println("制造911引擎");
	}

	public void buildWheel() {
		System.out.println("制造911引擎");
	}

	public Car buildCar() {
		System.out.println("911汽车各部组装完毕");
		return car;
	}
}