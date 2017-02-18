package 代理模式;

public class Main {

	public static void main(String[] args) {
		// 创建红酒生产工厂
		IRedWine redWine = new RealRedWineFactory();
		
		IRedWine redWineProxy = new RedWineProxy(redWine);
		redWineProxy.product();
		redWineProxy.sell();
	}
	
}
