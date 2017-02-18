package 建造者模式;

public class TaoCan1 extends AbstractMobilePackage implements IMobileBuilder {

	@Override
	public void buildMoney() {
		// TODO Auto-generated method stub
		this.mobilePackage.setMoney(20f);
	}

	@Override
	public void buildShortInfo() {
		// TODO Auto-generated method stub
		this.mobilePackage.setShortInfo(200);
	}

	@Override
	public void buildMusic() {
		// TODO Auto-generated method stub
		this.mobilePackage.setMusic("yyyyyy");
	}

	@Override
	public MobilePackage getMobilePackage() {
		// TODO Auto-generated method stub
		return this.mobilePackage;
	}

}
