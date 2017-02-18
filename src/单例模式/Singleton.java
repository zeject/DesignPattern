package 单例模式;

public class Singleton {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton == singleton2);
	}

	// 优点 手动创建,避免内存浪费
	// 缺点 synchronized 效率慢

	private static Singleton singleton = null;

	private Singleton() {
		// TODO Auto-generated constructor stub
		System.out.println("创建成功");
	}

	public synchronized static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}

}
