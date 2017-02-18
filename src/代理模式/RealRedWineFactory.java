package 代理模式;

public class RealRedWineFactory implements IRedWine {

	@Override
	public void product() {
		// TODO Auto-generated method stub
		System.out.println("红酒工厂生产红酒.....");
	}

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("红酒工厂销售红酒....");
	}

}
