package FacadeMethod;

public class Controller {
	private Frame frame;
	private Engine engine;
	private Wheel wheel;

	public Controller() {
		frame = new Frame();
		engine = new Engine();
		wheel = new Wheel();
	}

	public void build() {
		// 补全,汽车组装过程
		frame.create();
		engine.create();
		wheel.create();
		System.out.println("汽车组装完成");
	}
}