package BuilderMethod;

// Cayma制造者
public class BuilderCayma implements Builder {
	Car car = new Car();

	public void buildFrame() {
		System.out.println("制造Cayma骨架");
	}

	public void buildEngine() {
		System.out.println("制造Cayma引擎");
	}

	public void buildWheel() {
		System.out.println("制造Cayma轮子");
	}

	public Car buildCar() {
		System.out.println("Cayma汽车各部组装完毕");
		return car;
	}
}