package 代理模式;

public class RedWineProxy implements IRedWine {

	// 真正的红酒生产厂商
	private final IRedWine redWine;

	// 代理商出售红酒的权限
	private final boolean permission = true;

	public RedWineProxy(IRedWine redWine) {
		this.redWine = redWine;
	}

	@Override
	public void product() {
		// TODO Auto-generated method stub
		if (this.permission) {
			// 代理商有权限买红酒,是合法的
			System.out.println("这是合法的红酒代理商");
			System.out.println("代理商接到订单,通知工厂生产....");
			this.redWine.product();
		} else {
			System.out.println("非法的红酒代理商");
		}
	}

	@Override
	public void sell() {
		if (this.permission) {
			this.redWine.sell();
			System.out.println("代理商从工厂拿到酒,然后高价卖出");
		} else {
			System.out.println("非法的红酒代理商");
		}
	}

}
