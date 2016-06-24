package BuilderMethod;

// 指导者
public class Director {
	private Builder builder;

	// 传入具体制造者
	public Director(Builder builder) {
		this.builder = builder;
	}

	public Car build() {
		// 补全,制造汽车各个组件
		builder.buildCar();
		builder.buildEngine();
		builder.buildFrame();
		builder.buildWheel();
		return builder.buildCar();
	}
}
