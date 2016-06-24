package SingletonMethod;

public class Singleton {

	private static Singleton instance;

	// 补全 构造器

	public static Singleton getInstance() {
		// synchronized加锁同步会降低效率,这里先判断是否为空
		// 不为空则不需要加锁,提高程序效率
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		// 判断两个实例s1 s2是否为同一个实例
		System.out.println(s1 == s2);
	}
}