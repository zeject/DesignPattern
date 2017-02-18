package 单例模式;

public class Singleton2 {

	public static void main(String[] args) {
		Singleton2 singleton = Singleton2.getInstance();
		Singleton2 singleton2 = Singleton2.getInstance();
		System.out.println(singleton == singleton2);
	}

	private Singleton2() {
		// TODO Auto-generated constructor stub
		System.out.println("success");
	}

	private static Singleton2 singleton2 = new Singleton2();

	public static Singleton2 getInstance() {
		return singleton2;
	}

}
