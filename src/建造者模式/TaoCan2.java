package 建造者模式;

public class TaoCan2 extends AbstractMobilePackage implements IMobileBuilder {

	@Override
	public void buildMoney() {
		// TODO Auto-generated method stub
		this.mobilePackage.setMoney(30f);
	}

	@Override
	public void buildShortInfo() {
		// TODO Auto-generated method stub
		this.mobilePackage.setShortInfo(300);
	}

	@Override
	public void buildMusic() {
		// TODO Auto-generated method stub
		this.mobilePackage.setMusic("eeeeeeee");
	}

	@Override
	public MobilePackage getMobilePackage() {
		// TODO Auto-generated method stub
		return this.mobilePackage;
	}

}
